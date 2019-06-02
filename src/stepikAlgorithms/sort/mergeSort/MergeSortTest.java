package stepikAlgorithms.sort.mergeSort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {
	private MergeSort ms;

	@Before
	public void setUp() throws Exception {
		ms = new MergeSort();
	}

	@Test
	public void test() {
		// Given
		int[] arr = new int[] { 2, 3, 9, 2, 9 };
		
		// When
		ms.sort(arr);
		
		// Then
		for(int i = 1; i < arr.length; i++) {
			assertTrue(arr[i - 1] <= arr[i]);
		}
	}
}
