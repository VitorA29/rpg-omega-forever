package rpg.item.data.modification.enchantment;

import rpg.character.attribute.MainAttribute;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum Enchantment
{
	SHARP( 0, MainAttribute.LUCK );
	private int value;
	private MainAttribute attribute;

	private Enchantment( int value, MainAttribute attribute )
	{
		this.value = value;
		this.attribute = attribute;
	}
}
