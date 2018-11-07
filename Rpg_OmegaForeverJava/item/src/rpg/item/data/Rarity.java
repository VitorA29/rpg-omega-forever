package rpg.item.data;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum Rarity
{
	COMMUM( 0, 70, 100 ), UNCOMMUM( 1, 60, 80 ), RARE( 2, 40, 60 ), UNIQUE( 3, 10, 40 ), MITHICAL( 4, 0, 15 );
	final int value;
	final int minChance;
	final int maxChance;

	/**
	 * The constructor for the Rarity
	 * @param value
	 * @param minChance
	 * @param maxChance
	 * @version %VERSION%
	 */
	private Rarity( int value, int minChance, int maxChance )
	{
		this.value = value;
		this.minChance = minChance;
		this.maxChance = maxChance;
	}

	/**
	 * The getter for the value field.
	 * @return the value.
	 * @version %VERSION%
	 */
	public int getValue()
	{
		return value;
	}

	/**
	 * The getter for the drop chance.
	 * @return the drop chance.
	 * @version %VERSION%
	 */
	public double getDropChance( double dropRate )
	{
		return minChance + dropRate * ( maxChance - minChance );
	}
}
