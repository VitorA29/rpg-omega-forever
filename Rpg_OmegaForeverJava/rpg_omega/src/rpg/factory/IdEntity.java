package rpg.factory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
@Entity
@Table( name = "rpg_dao" )
public class IdEntity implements Comparable<IdEntity>
{
	@Id
	@Column( updatable = false )
	private Integer id;
	@Column( nullable = true )
	private Integer validIdIndex = -1;
	@Column( nullable = true )
	private String validIdValue = "";

	/**
	 * The constructor for the IdEntity.
	 * @version %VERSION%
	 */
	public IdEntity()
	{
		// do nothing
	}

	/**
	 * The constructor for the IdEntity.
	 * @param id
	 * @param validIdIndex
	 * @version %VERSION%
	 */
	public IdEntity( Integer id, Integer validIdIndex )
	{
		this.id = id;
		this.validIdIndex = validIdIndex;
	}

	/**
	 * The constructor for the IdEntity.
	 * @param id
	 * @param validIdValue
	 * @version %VERSION%
	 */
	public IdEntity( Integer id, String validIdValue )
	{
		this.id = id;
		this.validIdValue = validIdValue;
	}

	/**
	 * The getter for the id field.
	 * @return The id.
	 * @version %VERSION%
	 */
	public Integer getId()
	{
		return id;
	}

	/**
	 * The setter for the id field.
	 * @param id The id to set.
	 * @version %VERSION%
	 */
	public void setId( Integer id )
	{
		this.id = id;
	}

	/**
	 * The getter for the validId field.
	 * @return The validId.
	 * @version %VERSION%
	 */
	public Integer getValidIdIndex()
	{
		return validIdIndex;
	}

	/**
	 * The setter for the validId field.
	 * @param validId The validId to set.
	 * @version %VERSION%
	 */
	public void setValidIdIndex( Integer validIdIndex )
	{
		this.validIdIndex = validIdIndex;
	}

	/**
	 * The getter for the validIdValue field.
	 * @return The validIdValue.
	 * @version %VERSION%
	 */
	public String getValidIdValue()
	{
		return validIdValue;
	}

	/**
	 * The setter for the validIdValue field.
	 * @param validIdValue The validIdValue to set.
	 * @version %VERSION%
	 */
	public void setValidIdValue( String validIdValue )
	{
		this.validIdValue = validIdValue;
	}

	@Override
	public int compareTo( IdEntity idEntity )
	{
		if ( validIdValue.equals( "" ) && !idEntity.getValidIdValue().equals( "" ) )
		{
			return 1;
		} else if ( !validIdValue.equals( "" ) && idEntity.getValidIdValue().equals( "" ) )
		{
			return -1;
		}
		return validIdValue.compareTo( idEntity.getValidIdValue() );
	}
}
