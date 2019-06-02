package stepikAlgorithms.sort.mergeSort.inversionCounter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InversionCounterTest {
	private InversionCounter ic;

	@Before
	public void setUp() throws Exception {
		this.ic = new InversionCounter();
	}

	@Test
	public void test() {
		// Given
		int[] arr = new int[] { 2, 3, 9, 2, 9 };
		int expectedResult = 2;

		// When
		int result = this.ic.sort(arr);

		// Then
		assertEquals(expectedResult, result);
	}

	@Test
	public void test2() {
		// Given
		int[] arr = new int[] { 1, 20, 6, 4, 5 };
		int expectedResult = 5;

		// When
		int result = this.ic.sort(arr);

		// Then
		assertEquals(expectedResult, result);
	}
}
