package rpg.character.attribute;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public enum MainAttribute
{
	STRENGTH(0, "str"), AGILITY(1, "agi"), VITALITY(2, "vit"), INTELLIGENCE(3, "int"), DEXTERITY(4,"dex"), LUCK(5, "luk");
	private int value;
	private String shortName;
	
	/**
	 * The constructor for the MainAttributes.
	 * @since %STABLE_DATE%
	 * @version %VERSION%
	 */
	private MainAttribute(int value, String shortName)
	{
		this.value = value;
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
