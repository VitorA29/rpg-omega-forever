package rpg.factory;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class ManagerFactory
{
	private static final EnchantmentFactory enchantmetFactory = new EnchantmentFactory();

	private static final ItemFactory itemFactory = new ItemFactory();

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
}
