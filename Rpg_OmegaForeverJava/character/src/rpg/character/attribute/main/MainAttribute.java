package rpg.character.attribute.main;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum MainAttribute
{
	STRENGTH( "str" ), AGILITY( "agi" ), VITALITY( "vit" ), INTELLIGENCE( "int" ), DEXTERITY( "dex" ), LUCK( "luk" );

	private final String shortName;
	
	/**
	 * The constructor for the MainAttributes.
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	private MainAttribute( String shortName )
	{
		this.shortName = shortName;
	}
	
	/**
	 * The getter for the shortName field.
	 * @return the shortName.
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	public String getShortName()
	{
		return shortName;
	}
}
