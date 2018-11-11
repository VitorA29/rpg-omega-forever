package rpg.item.data.modification.enchantment;

import rpg.character.attribute.main.MainAttribute;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class Sharp extends IEnchantment
{
	/**
	 * The constructor for the Sharp.
	 * @param level
	 * @param attribute
	 * @version %VERSION%
	 */
	public Sharp( int level )
	{
		super( level, MainAttribute.LUCK );
	}
}
