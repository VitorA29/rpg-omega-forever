package rpg.character.attribute;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public enum MinorAttribute
{
	FISICAL_ATTACK( 0, "atk" ), MAGICAL_ATTACK( 1, "matk" ), FISICAL_DEFENSE( 2, "def" ), 
	MAGICAL_DEFENSE( 3, "mdef" ), ACCURACY( 4, "hit" ), CRITICAL( 5, "crit" ), 
	DODGE( 6, "flee" ), ATTACK_SPEED( 7, "aspd" ), HEALTH_POINTS( 8, "hp" ), MANA_POINTS( 9, "mp" );

	private int value;
	private String shortName;
	
	/**
	 * The constructor for the MinorAttribute.
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	private MinorAttribute(int value, String shortName)
	{
		this.value = value;
		this.shortName = shortName;
	}
}
