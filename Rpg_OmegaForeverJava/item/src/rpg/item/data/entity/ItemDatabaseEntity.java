package rpg.item.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
@Entity
@Table( name = "rpg_item" )
public class ItemDatabaseEntity
{
	@Id
	@GeneratedValue
	private String id;

	// All item elements
	@Column( nullable = false )
	private String name;
	@Column( nullable = true )
	private int value;
	@Column( nullable = false )
	private String rarity;
	@Column( name = "drop_rate", nullable = false )
	private float dropRate;
	@Column( nullable = false )
	private int price;

	@Column( name = "category", nullable = false )
	private String category;

	// Equipment elements
	@Column( nullable = true )
	private int level;
	@Column( nullable = true )
	private int durability;
	@Column( nullable = true )
	private int slots;
	@Column( nullable = true )
	private String element;
	@Column( nullable = true )
	private int enchantment;
	@Column( nullable = true )
	private int property;

	/**
	 * The constructor for the ItemDatabaseEntity.
	 * @version %VERSION%
	 */
	public ItemDatabaseEntity()
	{
		super();
	}

	/**
	 * The constructor for the ItemDatabaseEntity.
	 * @param name
	 * @param value
	 * @param rarity
	 * @param dropRate
	 * @param price
	 * @param category
	 * @param level
	 * @param durability
	 * @param slots
	 * @param element
	 * @param enchantment
	 * @param property
	 * @version %VERSION%
	 */
	public ItemDatabaseEntity(
	    String name, int value, String rarity, float dropRate, int price, String category, int level, int durability,
	    int slots, String element, int enchantment, int property
	)
	{
		super();
		this.name = name;
		this.value = value;
		this.rarity = rarity;
		this.dropRate = dropRate;
		this.price = price;
		this.category = category;
		this.level = level;
		this.durability = durability;
		this.slots = slots;
		this.element = element;
		this.enchantment = enchantment;
		this.property = property;
	}

	/**
	 * The getter for the id field.
	 * @return The id.
	 * @version %VERSION%
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * The setter for the id field.
	 * @param id The id to set.
	 * @version %VERSION%
	 */
	public void setId( String id )
	{
		this.id = id;
	}

	/**
	 * The getter for the name field.
	 * @return The name.
	 * @version %VERSION%
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * The setter for the name field.
	 * @param name The name to set.
	 * @version %VERSION%
	 */
	public void setName( String name )
	{
		this.name = name;
	}

	/**
	 * The getter for the value field.
	 * @return The value.
	 * @version %VERSION%
	 */
	public int getValue()
	{
		return value;
	}

	/**
	 * The setter for the value field.
	 * @param value The value to set.
	 * @version %VERSION%
	 */
	public void setValue( int value )
	{
		this.value = value;
	}

	/**
	 * The getter for the rarity field.
	 * @return The rarity.
	 * @version %VERSION%
	 */
	public String getRarity()
	{
		return rarity;
	}

	/**
	 * The setter for the rarity field.
	 * @param rarity The rarity to set.
	 * @version %VERSION%
	 */
	public void setRarity( String rarity )
	{
		this.rarity = rarity;
	}

	/**
	 * The getter for the dropRate field.
	 * @return The dropRate.
	 * @version %VERSION%
	 */
	public float getDropRate()
	{
		return dropRate;
	}

	/**
	 * The setter for the dropRate field.
	 * @param dropRate The dropRate to set.
	 * @version %VERSION%
	 */
	public void setDropRate( float dropRate )
	{
		this.dropRate = dropRate;
	}

	/**
	 * The getter for the price field.
	 * @return The price.
	 * @version %VERSION%
	 */
	public int getPrice()
	{
		return price;
	}

	/**
	 * The setter for the price field.
	 * @param price The price to set.
	 * @version %VERSION%
	 */
	public void setPrice( int price )
	{
		this.price = price;
	}

	/**
	 * The getter for the category field.
	 * @return The category.
	 * @version %VERSION%
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * The setter for the category field.
	 * @param category The category to set.
	 * @version %VERSION%
	 */
	public void setCategory( String category )
	{
		this.category = category;
	}

	/**
	 * The getter for the level field.
	 * @return The level.
	 * @version %VERSION%
	 */
	public int getLevel()
	{
		return level;
	}

	/**
	 * The setter for the level field.
	 * @param level The level to set.
	 * @version %VERSION%
	 */
	public void setLevel( int level )
	{
		this.level = level;
	}

	/**
	 * The getter for the durability field.
	 * @return The durability.
	 * @version %VERSION%
	 */
	public int getDurability()
	{
		return durability;
	}

	/**
	 * The setter for the durability field.
	 * @param durability The durability to set.
	 * @version %VERSION%
	 */
	public void setDurability( int durability )
	{
		this.durability = durability;
	}

	/**
	 * The getter for the slots field.
	 * @return The slots.
	 * @version %VERSION%
	 */
	public int getSlots()
	{
		return slots;
	}

	/**
	 * The setter for the slots field.
	 * @param slots The slots to set.
	 * @version %VERSION%
	 */
	public void setSlots( int slots )
	{
		this.slots = slots;
	}

	/**
	 * The getter for the element field.
	 * @return The element.
	 * @version %VERSION%
	 */
	public String getElement()
	{
		return element;
	}

	/**
	 * The setter for the element field.
	 * @param element The element to set.
	 * @version %VERSION%
	 */
	public void setElement( String element )
	{
		this.element = element;
	}

	/**
	 * The getter for the enchantment field.
	 * @return The enchantment.
	 * @version %VERSION%
	 */
	public int getEnchantment()
	{
		return enchantment;
	}

	/**
	 * The setter for the enchantment field.
	 * @param enchantment The enchantment to set.
	 * @version %VERSION%
	 */
	public void setEnchantment( int enchantment )
	{
		this.enchantment = enchantment;
	}

	/**
	 * The getter for the property field.
	 * @return The property.
	 * @version %VERSION%
	 */
	public int getProperty()
	{
		return property;
	}

	/**
	 * The setter for the property field.
	 * @param property The property to set.
	 * @version %VERSION%
	 */
	public void setProperty( int property )
	{
		this.property = property;
	}
}
