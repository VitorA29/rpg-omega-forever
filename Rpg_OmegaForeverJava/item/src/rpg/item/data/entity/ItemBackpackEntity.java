package rpg.item.data.entity;

import java.util.Map;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class ItemBackpackEntity
{
	// All item elements
	private String id;
	private String name;
	private int value;
	private String rarity;
	private float dropRate;
	private int price;

	private String category;

	// Equipament elements
	private int level;
	private int durability;
	private String element;
	private int enchantment;
	private Map<String, Integer> enchantments;
	private int property;
	private Map<String, Integer> properties;

	// Refinable
	private int refine;
}
