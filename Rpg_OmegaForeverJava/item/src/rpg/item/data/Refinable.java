package rpg.item.data;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class Refinable extends Equipable
{
	final private int MAX_REFINE_VALUE = 20;
	private int refine;
	private int bonusValue;

	@Override
	public int getItemValue()
	{
		return super.getItemValue() + bonusValue;
	}

	/**
	 * The getter for the refine field.
	 * @return the refine.
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	public int getRefine()
	{
		return refine;
	}

	/**
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	private boolean refine()
	{
		if ( refine < MAX_REFINE_VALUE )
		{
			if ( Math.random() < 0.3 )
			{
				if ( refine + getLevel() < 9 )
				{
					bonusValue += getValue() * ( 1 + ( getLevel() ) * 10 );
				} else
				{
					bonusValue += getValue() * ( 1 + ( Math.random()
					    * ( getLevel() + getRarity().getValue() ) ) * 10 );
				}
				return true;
			} else
			{
				setDurability( 1 );
				return false;
			}
		}
		return false;
	}
}
