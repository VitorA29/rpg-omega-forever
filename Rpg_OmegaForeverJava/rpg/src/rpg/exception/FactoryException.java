package rpg.exception;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class FactoryException extends OmegaException
{

	/**
	 * The constructor for the FactoryException.
	 * @param className The name of the class
	 * @param throwable The throwable element
	 * @version %VERSION%
	 */
	public FactoryException( String className, Throwable throwable )
	{
		super( className, throwable );
	}

}
