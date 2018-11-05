package rpg.item;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public enum Rarity
{
	COMMUM( 0, 70, 100 ), UNCOMMUM( 1, 60, 80 ), RARE( 2, 40, 60 ),
	UNIQUE( 3, 10, 40 ), MITHICAL( 4, 0, 15 );
	final int value;
	final int minChance;
	final int maxChance;

	/**
	 * The constructor for the Rarity
	 * @param value
	 * @param minChance
	 * @param maxChance
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	private Rarity( int value, int minChance, int maxChance )
	{
		this.value = value;
		this.minChance = minChance;
		this.maxChance = maxChance;
	}

	/**
	 * 
	 * @return
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	public int getValue()
	{
		return value;
	}
	/**
	 * 
	 * @param dropRate
	 * @return
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	public double getDropRate( double dropRate )
	{
		return minChance + dropRate * ( maxChance - minChance );
	}
}
