package rpg.item.data;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class Item
{
	private final String id;
	private final String name;
	private final int value;
	private final Rarity rarity;
	private final float dropRate;
	private final int price;

	public Item( String id, String name, int value, Rarity rarity, float dropRate, int price )
	{
		this.id = id;
		this.name = name;
		this.value = value;
		this.rarity = rarity;
		this.dropRate = dropRate;
		this.price = price;
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
	 * The getter for the name field.
	 * @return The name.
	 * @version %VERSION%
	 */
	public String getName()
	{
		return name;
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
	 * The getter for the rarity field
	 * @return the rarity
	 * @version %VERSION%
	 */
	public Rarity getRarity()
	{
		return rarity;
	}

	/**
	 * The getter for the dropRate field
	 * @return the dropRate
	 * @version %VERSION%
	 */
	public float getDropRate()
	{
		return rarity.getDropChance( dropRate );
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
}
