/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
package rpg;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import rpg.item.data.entity.ItemDatabaseEntity;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public class Teste
{
	private static SessionFactory factory;
	public static void main( String[] args )
	{
		try
		{
			factory = new Configuration().configure().buildSessionFactory();
		} catch ( Throwable ex )
		{
			System.err.println( "Failed to create sessionFactory object." + ex );
			throw new ExceptionInInitializerError( ex );
		}
		addItem( "teste-item" );
		factory.close();
	}

	/* Method to CREATE an employee in the database */
	public static String addItem( String name )
	{
		Session session = factory.openSession();
		Transaction tx = null;
		String itemID = null;

		try
		{
			tx = session.beginTransaction();
			ItemDatabaseEntity item = new ItemDatabaseEntity( name, 0, "", 0, 0, "", 0, 0, 0, "", 0, 0 );
			itemID = (String) session.save( item );
			tx.commit();
		} catch ( HibernateException e )
		{
			if ( tx != null )
			{
				tx.rollback();
			}
			e.printStackTrace();
		} finally
		{
			session.close();
		}
		return itemID;
	}
}
