package rpg.item.data.enchantment;

import rpg.character.attribute.MainAttributes;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public abstract class IEnchantment
{
	private int level;
	private MainAttributes attribute;
	
	/**
	 * The getter for the level field.
	 * @return the level.
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	public int getLevel()
	{
		return level;
	}
}
