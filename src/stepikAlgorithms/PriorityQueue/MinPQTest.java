package stepikAlgorithms.PriorityQueue;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MinPQTest {
	private MinPQ heap;
	private Random rand;

	@Before
	public void setUp() throws Exception {
		heap = new MinPQ();
		rand = new Random();
	}

	@Test
	public void test() {
		// Given
		int expectedMin = 2;
		int expectedMin2 = 3;

		heap.insert(expectedMin2);
		heap.insert(5);
		heap.insert(7);
		heap.insert(expectedMin);
		heap.insert(4);
		heap.insert(10);

		// When
		int min = heap.extractMin();
		int min2 = heap.extractMin();

		// Then
		assertEquals(expectedMin, min);
		assertEquals(expectedMin2, min2);
	}

	@Test
	public void test2() {
		// Given
		int expectedMin = Integer.MAX_VALUE;
		for (int i = 0; i < 100; i++) {
			int randomNum = rand.nextInt(100);

			if (expectedMin > randomNum)
				expectedMin = randomNum;

			heap.insert(randomNum);
		}

		// When
		int min = heap.extractMin();

		// Then
		assertEquals(expectedMin, min);
	}
}
