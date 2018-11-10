/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
package rpg;

import rpg.item.data.modification.enchantment.Enchantment;
import rpg.item.data.modification.enchantment.EnchantmentFactory;
import rpg.item.data.modification.enchantment.IEnchantment;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public class Teste
{
	public static void main( String[] args )
	{
		try
		{
			IEnchantment enchantment = EnchantmentFactory.getEnchantment( 2, Enchantment.SHARP.getEnchantmentClass() );
			System.out.println( enchantment.getAlgo() );
		} catch ( Exception e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
