package rpg.factory;

import rpg.dao.IRpgEntity;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class ManagerFactory
{
	private static final EnchantmentFactory enchantmetFactory;
	private static final ItemFactory itemFactory;
	private static final DaoFactory daoFactory;

	static
	{
		enchantmetFactory = new EnchantmentFactory();
		itemFactory = new ItemFactory();
		daoFactory = new DaoFactory();
	}

	private ManagerFactory()
	{
		// blocking class instantiation
	}

	public static EnchantmentFactory getEnchantmentFactory()
	{
		return enchantmetFactory;
	}

	public static ItemFactory getItemFactory()
	{
		return itemFactory;
	}

	public static DaoFactory getDaoFactory( Class<? extends IRpgEntity> entityClass )
	{
		daoFactory.prepareGenericDao( entityClass );
		return daoFactory;
	}
}
