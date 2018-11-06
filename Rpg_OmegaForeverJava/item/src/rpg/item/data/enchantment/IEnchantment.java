package rpg.item.data.enchantment;

import rpg.character.attribute.MainAttributes;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public abstract class IEnchantment
{
	private int level;
	private MainAttributes attribute;
	
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
