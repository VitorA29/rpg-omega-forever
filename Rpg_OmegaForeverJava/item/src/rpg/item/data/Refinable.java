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
public class Refinable extends Equipable
{
	final private int MAX_REFINE_VALUE = 20;
	private int refine;
	private int bonusValue;

	/**
	 * The constructor for the Refinable.
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
	 * @param refine
	 * @param bonusValue
	 * @version %VERSION%
	 */
	public Refinable(
	    String id, String name, int value, Rarity rarity, float dropRate, int price, int level, int durabilityBaseValue,
	    int durability, Element element, List<EquipamentSlot> slots, List<Enchantment> enchatments,
	    List<Property> properties, int refine, int bonusValue
	)
	{
		super(
		    id, name, value, rarity, dropRate, price, level, durabilityBaseValue, durability, element, slots,
		    enchatments, properties
		);
		this.refine = refine;
		this.bonusValue = bonusValue;
	}

	@Override
	public int getItemValue()
	{
		return super.getItemValue() + bonusValue;
	}

	/**
	 * The getter for the refine field.
	 * @return the refine.
	 * @version %VERSION%
	 */
	public int getRefine()
	{
		return refine;
	}

	/**
	 * Method for refine the equipment, for raise the Item Value.
	 * @version %VERSION%
	 */
	public boolean refine()
	{
		if ( refine < MAX_REFINE_VALUE )
		{
			if ( Math.random() < 0.3 )
			{
				if ( refine + getLevel() < 9 )
				{
					bonusValue += getValue() * ( 1 + ( getLevel() ) * 10 );
				} else
				{
					bonusValue += getValue() * ( 1 + ( Math.random() * ( getLevel() + getRarity().ordinal() ) ) * 10 );
				}
				return true;
			} else
			{
				setDurability( 1 );
				return false;
			}
		}
		return false;
	}
}
