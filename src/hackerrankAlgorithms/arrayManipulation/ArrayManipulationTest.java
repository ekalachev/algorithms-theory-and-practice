package hackerrankAlgorithms.arrayManipulation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayManipulationTest {
	private ArrayManipulation am;
	
	@Before
	public void setUp() throws Exception {
		am = new ArrayManipulation();
	}

	@Test
	public void given_gaeries_of_ranges_with_sums_When_arrayManipulation_then_returns_max_sum() {
		// Given
		int m = 3;
		int[][] queries = new int[m][3];
		queries[0][0] = 1;
		queries[0][1] = 2;
		queries[0][2] = 100;
		
		queries[1][0] = 2;
		queries[1][1] = 5;
		queries[1][2] = 100;
		
		queries[2][0] = 3;
		queries[2][1] = 4;
		queries[2][2] = 100;
		
		long expectedMax = 200;
		
		// When
		long max = am.arrayManipulation(5, queries);
		
		
		// Then
		assertEquals(expectedMax, max);
	}
	
	@Test
	public void given_gaeries_of_ranges_with_sums_When_arrayManipulation2_then_returns_max_sum() {
		// Given
		int m = 3;
		int[][] queries = new int[m][3];
		queries[0][0] = 1;
		queries[0][1] = 2;
		queries[0][2] = 100;
		
		queries[1][0] = 2;
		queries[1][1] = 5;
		queries[1][2] = 100;
		
		queries[2][0] = 3;
		queries[2][1] = 4;
		queries[2][2] = 100;
		
		long expectedMax = 200;
		
		// When
		long max = am.arrayManipulation2(5, queries);
		
		
		// Then
		assertEquals(expectedMax, max);
	}
}
