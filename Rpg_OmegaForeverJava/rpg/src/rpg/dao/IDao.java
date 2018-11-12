package rpg.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public interface IDao<T, I extends Serializable>
{
	public I create( T entity ) throws Exception;

	public List<T> read() throws Exception;

	public void update( T entity ) throws Exception;

	public void delete( I id ) throws Exception;

	public T find( I id ) throws Exception;
}
