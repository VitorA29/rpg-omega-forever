package rpg.factory;

import java.lang.reflect.Constructor;

import rpg.exception.FactoryException;
import rpg.item.data.modification.enchantment.IEnchantment;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class EnchantmentFactory
{
	private final String className;

	protected EnchantmentFactory()
	{
		className = "EnchantmentFactory";
	}

	public IEnchantment getEnchantment( int level, String enchantmentClass ) throws FactoryException
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
