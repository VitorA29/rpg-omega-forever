package rpg.item.data.modification.enchantment;

import rpg.character.attribute.main.MainAttribute;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum Enchantment
{
	SHARP( MainAttribute.LUCK, "rpg.item.data.modification.enchantment.Sharp" );

	private final MainAttribute attribute;
	private final String enchantmentClass;

	private Enchantment( MainAttribute attribute, String enchantmentClass )
	{
		this.attribute = attribute;
		this.enchantmentClass = enchantmentClass;
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

	/**
	 * The getter for the enchantmentClass field.
	 * @return The enchantmentClass.
	 * @version %VERSION%
	 */
	public String getEnchantmentClass()
	{
		return enchantmentClass;
	}
}
