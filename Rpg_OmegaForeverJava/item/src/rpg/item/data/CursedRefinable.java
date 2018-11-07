package rpg.item.data;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class CursedRefinable extends Refinable
{
	final private int MAX_REFINE_LEVEL_BONUS = 15;

	@Override
	public int getItemValue()
	{
		return super.getItemValue() + ( getRefine() < MAX_REFINE_LEVEL_BONUS ? getRefine() * getRefine()
		    : MAX_REFINE_LEVEL_BONUS * MAX_REFINE_LEVEL_BONUS );
	}
}
