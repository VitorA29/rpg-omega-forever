package rpg.exception;

import java.util.logging.Logger;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public abstract class OmegaException extends Exception
{
	private final Logger logger;

	public OmegaException( String message, Throwable throwable )
	{
		super( message, throwable );
		logger = null;
	}
}
