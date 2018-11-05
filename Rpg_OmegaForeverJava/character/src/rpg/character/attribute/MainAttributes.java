package rpg.character.attribute;

/**
 * Date: %STABLE_DATE%
 * Version: %VERSION%
 */
public enum MainAttributes
{
	STRENGTH(0, "str"), AGILITY(1, "agi"), VITALITY(2, "vit"), INTELLIGENCE(3, "int"), DEXTERITY(4,"dex"), LUCK(5, "luk");
	private int value;
	private String shortName;
	
	/**
	 * The constructor for the MainAttributes.
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	private MainAttributes(int value, String shortName)
	{
		this.value = value;
		this.shortName = shortName;
	}
	
	/**
	 * The getter for the shortName field.
	 * @return the shortName.
	 * Date: %STABLE_DATE%
	 * Version: %VERSION%
	 */
	public String getShortName()
	{
		return shortName;
	}
}
