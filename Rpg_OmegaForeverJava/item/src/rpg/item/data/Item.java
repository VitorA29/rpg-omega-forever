package rpg.item.data;

import rpg.item.Rarity;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public class Item
{
	private Rarity rarity;
	private double dropRate;

	/**
	 * The getter for the rarity field
	 * 
	 * @return the rarity
	 */
	public Rarity getRarity()
	{
		return rarity;
	}

	/**
	 * The getter for the dropRate field
	 * 
	 * @return the dropRate
	 */
	public double getDropRate()
	{
		return dropRate;
	}

}
