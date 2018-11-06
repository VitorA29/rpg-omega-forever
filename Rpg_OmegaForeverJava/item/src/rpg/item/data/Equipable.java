package rpg.item.data;

import java.util.List;

import rpg.character.EquipamentSlot;
import rpg.item.data.enchantment.IEnchantment;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class Equipable extends Item
{
	private int value;
	private int level;
	private int durability;
	private List<EquipamentSlot> slots;
	private List<IEnchantment> enchatments;
	
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
	 * The getter for the value field.
	 * @return the value.
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	public int getValue()
	{
		return value;
	}

	/**
	 * The getter for the item value;
	 * @return the item value
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	public int getItemValue()
	{
		return value;
	}

	/**
	 * The setter for the durability field.
	 * @param durability the durability to set.
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	public void setDurability( int durability )
	{
		this.durability = durability;
	}

	/**
	 * Reduce the durability of item by the specified value.
	 * @param value The value to reduce the durability.
	 * @since %STABLE_DATE%
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
