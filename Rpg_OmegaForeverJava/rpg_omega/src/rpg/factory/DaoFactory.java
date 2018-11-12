package rpg.factory;

import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mifmif.common.regex.Generex;

import rpg.dao.GenericDao;
import rpg.dao.IDao;
import rpg.dao.IRpgEntity;
import rpg.exception.DaoException;
import rpg.exception.FactoryException;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class DaoFactory implements IDao<IRpgEntity, String>
{
	private String exceptionMessage = "DaoFactory - ";
	private SessionFactory sessionFactory;
	private GenericDao<IdEntity, Integer> idEntityDao;
	private final Generex generex;
	private GenericDao<IRpgEntity, String> daoBuilder;
	private Class<IRpgEntity> persistClass;

	protected DaoFactory()
	{
		sessionFactory = null;
		idEntityDao = null;
		generex = new Generex( "RPG_[A-Z]{4}\\d{2}" );
		daoBuilder = null;
		persistClass = null;
	}

	public void beginFactory()
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		idEntityDao = new GenericDao<>( sessionFactory, IdEntity.class );
		if ( persistClass != null && daoBuilder == null )
		{
			daoBuilder = new GenericDao<>( sessionFactory, persistClass );
		}
	}

	public void endFactory()
	{
		sessionFactory.close();
		sessionFactory = null;
		idEntityDao = null;
		daoBuilder = null;
	}

	private String exceptionMessageBuilder()
	{
		return exceptionMessage + persistClass.getSimpleName() + ": ";
	}

	private IdEntity generateId() throws FactoryException
	{
		List<IdEntity> freeIdList = null;
		try
		{
			freeIdList = idEntityDao.read();
		} catch ( DaoException e )
		{
			throw new FactoryException( exceptionMessageBuilder() + "generate new Id", e.getCause() );
		}
		if ( freeIdList.size() > 1 )
		{
			Collections.sort( freeIdList );
		}
		return freeIdList.get( 0 );
	}
	
	private void nextId( IdEntity idEntity ) throws FactoryException
	{
		if ( !idEntity.getValidIdValue().equals( "" ) )
		{
			try
			{
				idEntityDao.delete( idEntity.getId() );
			} catch ( DaoException e )
			{
				throw new FactoryException( exceptionMessageBuilder() + "delete used Id", e.getCause() );
			}
		} else
		{
			idEntity.setValidIdIndex( idEntity.getValidIdIndex() + 1 );
			try
			{
				idEntityDao.update( idEntity );
			} catch ( DaoException e )
			{
				throw new FactoryException( exceptionMessageBuilder() + "update id cursor", e.getCause() );
			}
		}
	}

	@SuppressWarnings( "unchecked" )
	protected void prepareGenericDao( Class<? extends IRpgEntity> entityClass )
	{
		if ( persistClass == null || persistClass.getSimpleName().equals( entityClass.getSimpleName() ) )
		{
			persistClass = (Class<IRpgEntity>) entityClass;
		}
	}

	@Override
	public String create( IRpgEntity entity ) throws FactoryException
	{
		IdEntity idEntity = generateId();
		String newId = null;
		if ( !idEntity.getValidIdValue().equals( "" ) )
		{
			newId = idEntity.getValidIdValue();
		} else
		{
			newId = generex.getMatchedString( idEntity.getValidIdIndex() );
		}
		entity.setId( newId );
		try
		{
			daoBuilder.create( entity );
			nextId( idEntity );
			return newId;
		} catch ( DaoException e )
		{
			throw new FactoryException( exceptionMessageBuilder() + "create", e.getCause() );
		}
	}

	@Override
	public List<IRpgEntity> read() throws FactoryException
	{
		try
		{
			return daoBuilder.read();
		} catch ( DaoException e )
		{
			throw new FactoryException( exceptionMessageBuilder() + "find", e.getCause() );
		}
	}

	@Override
	public void update( IRpgEntity entity ) throws FactoryException
	{
		try
		{
			daoBuilder.update( entity );
		} catch ( DaoException e )
		{
			throw new FactoryException( exceptionMessageBuilder() + "update", e.getCause() );
		}
	}

	@Override
	public void delete( String id ) throws FactoryException
	{
		try
		{
			daoBuilder.delete( id );
			List<IdEntity> freeIdList = null;
			freeIdList = idEntityDao.read();
			IdEntity idEntity = new IdEntity( freeIdList.size() + 1, id );
			idEntityDao.create( idEntity );
		} catch ( DaoException e )
		{
			throw new FactoryException( exceptionMessageBuilder() + "delete", e.getCause() );
		}
	}

	@Override
	public IRpgEntity find( String id ) throws FactoryException
	{
		try
		{
			return daoBuilder.find( id );
		} catch ( DaoException e )
		{
			throw new FactoryException( exceptionMessageBuilder() + "find", e.getCause() );
		}
	}
}
