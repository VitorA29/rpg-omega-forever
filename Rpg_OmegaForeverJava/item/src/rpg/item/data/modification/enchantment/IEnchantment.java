package rpg.item.data.modification.enchantment;

import rpg.character.attribute.main.MainAttribute;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public abstract class IEnchantment
{
	private final int level;
	private final MainAttribute attribute;

	public IEnchantment( int level, MainAttribute attribute )
	{
		this.level = level;
		this.attribute = attribute;
	}
	
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

	/**
	 * The getter for the attribute field.
	 * @return The attribute.
	 * @version %VERSION%
	 */
	public MainAttribute getAttribute()
	{
		return attribute;
	}
}
