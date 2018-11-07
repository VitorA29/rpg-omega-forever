package rpg.item.data.modification.enchantment;

import rpg.character.attribute.MainAttribute;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public abstract class IEnchantment
{
	private int level;
	private MainAttribute attribute;
	
	/**
	 * The getter for the level field.
	 * @return the level.
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	public int getLevel()
	{
		return level;
	}
}
