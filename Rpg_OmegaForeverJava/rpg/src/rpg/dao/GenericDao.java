package rpg.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import rpg.exception.DaoException;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class GenericDao<T, I extends Serializable> implements IDao<T, I>
{

	private final SessionFactory sessionFactory;

	private Class<T> persistedClass;

	public GenericDao( SessionFactory sessionFactory, Class<T> persistedClass )
	{
		this.sessionFactory = sessionFactory;
		this.persistedClass = persistedClass;
	}

	@SuppressWarnings( "unchecked" )
	@Override
	public I create( T entity ) throws DaoException
	{
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		I identifier = null;
		try
		{
			tx = session.beginTransaction();
			identifier = (I) session.save( entity );
			session.flush();
			tx.commit();
		} catch ( HibernateException e )
		{
			if ( tx != null )
			{
				tx.rollback();
			}
			throw new DaoException( persistedClass.getSimpleName(), e.getCause() );
		} finally
		{
			session.close();
		}

		return identifier;
	}

	@SuppressWarnings( "unchecked" )
	@Override
	public List<T> read() throws DaoException
	{
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<T> result = null;
		try
		{
			tx = session.beginTransaction();
			result = session.createQuery( "FROM " + persistedClass.getSimpleName() ).list();
			tx.commit();
		} catch ( HibernateException e )
		{
			if ( tx != null )
			{
				tx.rollback();
			}
			new DaoException( persistedClass.getSimpleName(), e.getCause() );
		} finally
		{
			session.close();
		}
		return result;
	}

	@Override
	public void update( T entity ) throws DaoException
	{
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try
		{
			tx = session.beginTransaction();
			session.update( entity );
			tx.commit();
		} catch ( HibernateException e )
		{
			if ( tx != null )
			{
				tx.rollback();
			}
			new DaoException( persistedClass.getSimpleName(), e.getCause() );
		} finally
		{
			session.close();
		}
	}

	@Override
	public void delete( I id ) throws DaoException
	{
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try
		{
			tx = session.beginTransaction();
			T entity = (T) session.get( persistedClass, id );
			session.delete( entity );
			tx.commit();
		} catch ( HibernateException e )
		{
			if ( tx != null )
			{
				tx.rollback();
			}
			new DaoException( persistedClass.getSimpleName(), e.getCause() );
		} finally
		{
			session.close();
		}
	}

	@Override
	public T find( I id ) throws DaoException
	{
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		T entity = null;
		try
		{
			tx = session.beginTransaction();
			entity = (T) session.get( persistedClass, id );
			tx.commit();
		} catch ( HibernateException e )
		{
			if ( tx != null )
			{
				tx.rollback();
			}
			new DaoException( persistedClass.getSimpleName(), e.getCause() );
		} finally
		{
			session.close();
		}
		return entity;
	}
}
