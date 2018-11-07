package rpg.item.data.modification.element;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum Element
{
	NEUTRAL( 0, "neutral" ), FIRE( 1, "fire" ), WATER( 2, "water" ), WIND( 3, "wind" ), EARTH( 4, "earth" ),
	LIGHTNING( 5, "lightning" );

	final private int value;
	final private String name;

	private Element( int value, String name )
	{
		this.value = value;
		this.name = name;
	}
}
