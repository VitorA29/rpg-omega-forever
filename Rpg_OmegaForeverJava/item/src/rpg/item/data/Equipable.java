package rpg.item.data;

import java.util.List;

import rpg.character.EquipamentSlot;
import rpg.item.data.modification.element.Element;
import rpg.item.data.modification.enchantment.Enchantment;
import rpg.item.data.modification.property.Property;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class Equipable extends Item
{
	private int level;
	private int durabilityBaseValue;
	private int durability;
	private Element element;
	private List<EquipamentSlot> slots;
	private List<Enchantment> enchatments;
	private List<Property> properties;
	
	/**
	 * The constructor for the Equipable.
	 * @param id
	 * @param name
	 * @param value
	 * @param rarity
	 * @param dropRate
	 * @param price
	 * @param level
	 * @param durabilityBaseValue
	 * @param durability
	 * @param element
	 * @param slots
	 * @param enchatments
	 * @param properties
	 * @version %VERSION%
	 */
	public Equipable(
	    String id, String name, int value, Rarity rarity, float dropRate, int price, int level, int durabilityBaseValue,
	    int durability, Element element, List<EquipamentSlot> slots, List<Enchantment> enchatments,
	    List<Property> properties
	)
	{
		super( id, name, value, rarity, dropRate, price );
		this.level = level;
		this.durability = durability;
		this.durabilityBaseValue = durabilityBaseValue;
		this.element = element;
		this.slots = slots;
		this.enchatments = enchatments;
		this.properties = properties;
	}

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

	/**
	 * Restore the item durability to it's original value.
	 * @version %VERSION%
	 */
	public void restore()
	{
		durability = durabilityBaseValue;
	}
}
