package stepikAlgorithms.binarySearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	private BinarySearch bs;

	@Before
	public void setUp() throws Exception {
		bs = new BinarySearch();
	}

	@Test
	public void test() {
		// Given
		int expectedIndex = 7;
		int[] array = new int[] { 3, 2, 3, 35, 1, 6, 9, 3, 4, 7, 22, 55, 12 };

		// When
		int actualIndex = bs.search(7, array);

		// Then
		assertEquals(expectedIndex, actualIndex);
	}

}
