package stepikAlgorithms.greedyKnapsack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GreedyKnapsackTest {
	private GreedyKnapsack gk;

	@Before
	public void setUp() throws Exception {
		this.gk = new GreedyKnapsack();
	}

	@Test
	public void test() {
		// Given
		Item[] items = new Item[] { new Item(60, 20), new Item(100, 50), new Item(120, 30) };
		double expectedCost = 180;
		
		// When
		double cost = this.gk.putMaximum(50, items);
		
		// Then
		assertEquals(expectedCost, cost, 0);
	}

	@Test
	public void test2() {
		// Given
		Item[] items = new Item[] { new Item(10, 4), new Item(10, 4) };
		double expectedCost = 5;
		
		// When
		double cost = this.gk.putMaximum(2, items);
		
		// Then
		assertEquals(expectedCost, cost, 0);
	}
}
