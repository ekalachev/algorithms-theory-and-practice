package stepikAlgorithms.PriorityQueue;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MaxPQTest {
	private MaxPQ heap;
	private Random rand;

	@Before
	public void setUp() throws Exception {
		heap = new MaxPQ();
		rand = new Random();
	}

	@Test
	public void test() {
		// Given
		int expectedMax = 10;
		int expectedMax2 = 7;

		heap.insert(3);
		heap.insert(5);
		heap.insert(expectedMax2);
		heap.insert(2);
		heap.insert(4);
		heap.insert(expectedMax);

		// When
		int max = heap.extractMax();
		int max2 = heap.extractMax();

		// Then
		assertEquals(expectedMax, max);
		assertEquals(expectedMax2, max2);
	}

	@Test
	public void test2() {
		// Given
		int expectedMax = Integer.MIN_VALUE;
		for (int i = 0; i < 100; i++) {
			int randomNum = rand.nextInt(100);

			if (expectedMax < randomNum)
				expectedMax = randomNum;

			heap.insert(randomNum);
		}

		// When
		int max = heap.extractMax();

		// Then
		assertEquals(expectedMax, max);
	}

}
