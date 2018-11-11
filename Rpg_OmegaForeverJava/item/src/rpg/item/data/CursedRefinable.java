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
public class CursedRefinable extends Refinable
{
	/**
	 * The constructor for the CursedRefinable.
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
	public CursedRefinable(
	    String id, String name, int value, Rarity rarity, float dropRate, int price, int level, int durabilityBaseValue,
	    int durability, Element element, List<EquipamentSlot> slots, List<Enchantment> enchatments,
	    List<Property> properties, int refine, int bonusValue
	)
	{
		super(
		    id, name, value, rarity, dropRate, price, level, durabilityBaseValue, durability, element, slots,
		    enchatments, properties, refine, bonusValue
		);
	}

	final private int MAX_REFINE_LEVEL_BONUS = 15;

	@Override
	public int getItemValue()
	{
		return super.getItemValue() + ( getRefine() < MAX_REFINE_LEVEL_BONUS ? getRefine() * getRefine()
		    : MAX_REFINE_LEVEL_BONUS * MAX_REFINE_LEVEL_BONUS );
	}
}
