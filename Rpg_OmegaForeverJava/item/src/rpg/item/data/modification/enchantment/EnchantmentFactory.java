package rpg.item.data.modification.enchantment;

import java.lang.reflect.Constructor;

import rpg.exception.FactoryException;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class EnchantmentFactory
{
	private static final String className = "EnchantmentFactory";

	private EnchantmentFactory()
	{
		// blocking class instantiation
	}

	public static IEnchantment getEnchantment( int level, String enchantmentClass ) throws FactoryException
	{
		Constructor<?> enchantmentContrutor;
		try
		{
			enchantmentContrutor = Class.forName( enchantmentClass )
			    .getConstructor( int.class );
			return (IEnchantment) enchantmentContrutor.newInstance( level );
		} catch ( Exception e )
		{
			throw new FactoryException( className, e.getCause() );
		}
	}
}
