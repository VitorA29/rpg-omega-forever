package rpg.item.data;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class Item
{
	private Rarity rarity;
	private double dropRate;

	/**
	 * The getter for the rarity field
	 * @return the rarity
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	public Rarity getRarity()
	{
		return rarity;
	}

	/**
	 * The getter for the dropRate field
	 * @return the dropRate
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	public double getDropRate()
	{
		return dropRate;
	}

}
