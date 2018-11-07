package rpg.item.data;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public abstract class IItem
{
	private String id;
	private String name;
	private int value;
	private Rarity rarity;
	private double dropRate;
	private int price;

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
	public double getDropRate()
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
