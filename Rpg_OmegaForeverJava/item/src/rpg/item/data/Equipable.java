package rpg.item.data;

import rpg.character.EquipamentSlot;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public class Equipable extends Item
{
	private int value;
	private int level;
	private int durability;
	private EquipamentSlot slot;
	
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

	/**
	 * The getter for the value field.
	 * @return the value.
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	public int getValue()
	{
		return value;
	}

	/**
	 * The getter for the item value;
	 * @return the item value
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	public int getItemValue()
	{
		return value;
	}

	/**
	 * The setter for the durability field.
	 * @param durability the durability to set.
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	public void setDurability( int durability )
	{
		this.durability = durability;
	}

	/**
	 * Reduce the durability of item by the specified value.
	 * @param value The value to reduce the durability.
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
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
