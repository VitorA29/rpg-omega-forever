package rpg.item.data;

import java.util.List;

import rpg.character.EquipamentSlot;
import rpg.item.data.modification.element.Element;
import rpg.item.data.modification.enchantment.IEnchantment;
import rpg.item.data.modification.property.IProperty;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class Equipable extends IItem
{
	private int level;
	private int durability;
	private List<EquipamentSlot> slots;
	private List<IEnchantment> enchatments;
	private List<IProperty> properties;
	private Element element;
	
	/**
	 * The getter for the level field.
	 * @return the level.
	 * @version %VERSION%
	 */
	public int getLevel()
	{
		return level;
	}

	/**
	 * The getter for the item value;
	 * @return the item value.
	 * @version %VERSION%
	 */
	public int getItemValue()
	{
		return getValue();
	}

	/**
	 * The setter for the durability field.
	 * @param durability the durability to set.
	 * @version %VERSION%
	 */
	public void setDurability( int durability )
	{
		this.durability = durability;
	}

	/**
	 * Reduce the durability of item by the specified value.
	 * @param value The value to reduce the durability.
	 * @version %VERSION%
	 */
	public void waste( int value )
	{
		if ( durability - value >= 0 )
		{
			durability -= value;
		} else
		{
			durability = -1;
		}
	}
}
