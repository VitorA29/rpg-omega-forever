package rpg.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @since %STABLE_DATE%
 * @version %VERSION%
 */
public class TestLimitedArrayList
{
	private List<Integer> limitedArrayList;

	@Before
	public void setUp()
	{
		limitedArrayList = new LimitedArrayList<>( 2 );
	}

	/**
	 * Test method for {@link rpg.util.LimitedArrayList#add(java.lang.Object)}.
	 * @version %VERSION%
	 */
	@Test
	public void testAdd()
	{
		limitedArrayList.add( 1 );
		limitedArrayList.add( 2 );
		assertEquals( 2, limitedArrayList.size() );
		limitedArrayList.add( 3 );
		assertEquals( 2, limitedArrayList.size() );
	}

	/**
	 * Test method for {@link rpg.util.LimitedArrayList#add(int, Object)}.
	 * @version %VERSION%
	 */
	@Test
	public void testAddIndex()
	{
		limitedArrayList.add( 1 );
		limitedArrayList.add( 2 );
		assertEquals( 2, limitedArrayList.size() );
		limitedArrayList.add( 0, 3 );
		assertEquals( 2, limitedArrayList.size() );
	}

	/**
	 * Test method for {@link rpg.util.LimitedArrayList#addAll(java.util.Collection)}.
	 * @version %VERSION%
	 */
	@Test
	public void testAddAll()
	{
		List<Integer> testList = new ArrayList<>();
		testList.add( 1 );
		testList.add( 2 );
		testList.add( 3 );
		limitedArrayList.addAll( testList );
		assertEquals( 0, limitedArrayList.size() );
	}

	/**
	 * Test method for {@link rpg.util.LimitedArrayList#addAll(int, Collection)}.
	 * @version %VERSION%
	 */
	@Test
	public void testAddAllIndex()
	{
		List<Integer> testList = new ArrayList<>();
		testList.add( 1 );
		testList.add( 2 );
		testList.add( 3 );
		limitedArrayList.addAll( testList );
		assertEquals( 0, limitedArrayList.size() );
	}

}
