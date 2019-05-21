package stepikAlgorithms.greedyKnapsack;

import java.util.Arrays;

public class GreedyKnapsack {
	public double putMaximum(int w, Item[] items) {
		Arrays.sort(items);
		
		double cost = 0;
		for(Item item: items) {
			if(w >= item.weight) {
				cost += item.cost;
				w -= item.weight;
			} else {
			 cost += (double)item.cost * w / item.weight;
			 break;
			}
		}
		
		return cost;
	}
}
