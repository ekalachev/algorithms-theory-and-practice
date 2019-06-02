package stepikAlgorithms.sort.insertionSort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {
	private InsertionSort is;

	@Before
	public void setUp() throws Exception {
		is = new InsertionSort();
	}

	@Test
	public void test() {
		// Given
		int[] arr = new int[] { 6, 3, 2, 1, 7, 3, 9 };

		// When
		int [] sortedArr = is.sort(arr);

		// Then
		for(int i = 1; i < sortedArr.length; i++) {
			assertTrue(sortedArr[i - 1] <= sortedArr[i]);
		}
	}

}
