package rpg.item.data.modification.element;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum Element
{
	NEUTRAL( "neutral" ), FIRE( "fire" ), WATER( "water" ), WIND( "wind" ), EARTH( "earth" ), LIGHTNING( "lightning" );

	private final String name;

	private Element( String name )
	{
		this.name = name;
	}
}
