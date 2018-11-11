package rpg.item.data;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum Rarity
{
	COMMUM( 70, 100 ), UNCOMMUM( 60, 80 ), RARE( 40, 60 ), UNIQUE( 10, 40 ), MITHICAL( 0, 15 );

	private final int minChance;
	private final int maxChance;

	/**
	 * The constructor for the Rarity
	 * @param minChance
	 * @param maxChance
	 * @version %VERSION%
	 */
	private Rarity( int minChance, int maxChance )
	{
		this.minChance = minChance;
		this.maxChance = maxChance;
	}

	/**
	 * The getter for the drop chance.
	 * @return the drop chance.
	 * @version %VERSION%
	 */
	public float getDropChance( float dropRate )
	{
		return minChance + dropRate * ( maxChance - minChance );
	}
}
