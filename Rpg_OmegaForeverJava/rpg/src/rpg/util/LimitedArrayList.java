package rpg.util;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class LimitedArrayList<E> extends ArrayList<E>
{
	private static final long serialVersionUID = 1L;
	private final int capacity;

	/**
	 * The constructor for the LimitedArrayList.
	 * @param capacity The max size of the list object;
	 * @version %VERSION%
	 */
	public LimitedArrayList( int capacity )
	{
		super();
		this.capacity = capacity;
	}

	@Override
	public boolean add( E e )
	{
		if ( size() < capacity )
		{
			return super.add( e );
		}
		return false;
	}

	@Override
	public void add( int index, E element )
	{
		if ( size() < capacity )
		{
			super.add( index, element );
		}
	}

	@Override
	public boolean addAll( Collection<? extends E> c )
	{
		if ( size() + c.size() < capacity )
		{
			return super.addAll( c );
		}
		return false;
	}

	@Override
	public boolean addAll( int index, Collection<? extends E> c )
	{
		if ( size() + c.size() < capacity )
		{
			return super.addAll( index, c );
		}
		return false;
	}
}
