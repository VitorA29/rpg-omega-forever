package rpg.character.attribute.minor;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum MinorAttribute
{
	FISICAL_ATTACK( "atk" ), MAGICAL_ATTACK( "matk" ), FISICAL_DEFENSE( "def" ), MAGICAL_DEFENSE( "mdef" ),
	ACCURACY("hit"), CRITICAL( "crit" ), DODGE( "flee" ), ATTACK_SPEED( "aspd" ), HEALTH_POINTS( "hp" ), MANA_POINTS( "mp" );

	private final String shortName;
	
	/**
	 * The constructor for the MinorAttribute.
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	private MinorAttribute( String shortName )
	{
		this.shortName = shortName;
	}
}
