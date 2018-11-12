/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
package rpg;

import rpg.factory.DaoFactory;
import rpg.factory.ManagerFactory;
import rpg.item.data.entity.ItemDatabaseEntity;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public class Teste
{
	public static void main( String[] args )
	{
		DaoFactory daoFactory = ManagerFactory.getDaoFactory( ItemDatabaseEntity.class );
		ItemDatabaseEntity item = new ItemDatabaseEntity(
		    "teste-item", 0, "", 0F, 0, "", null, null, null, null, null, null
		);
		try
		{
			daoFactory.beginFactory();
			String itemId = daoFactory.create( item );
			daoFactory.read();
			item.setName( "outro" );
			daoFactory.update( item );
			daoFactory.read();
			daoFactory.delete( itemId );
			daoFactory.read();
		} catch ( Exception e )
		{
			e.printStackTrace();
		}
		finally
		{
			daoFactory.endFactory();
		}
	}
}
