package stepikAlgorithms.greedyKnapsack;

public class Item implements Comparable<Item>{
	int cost;
	int weight;
	
	public Item(int cost, int weight) {
		this.cost = cost;
		this.weight = weight;
	}

	@Override
	public int compareTo(Item o) {
		long r1 = (long)this.cost * o.weight;
		long r2 = (long)this.weight * o.cost;
		
		return -Long.compare(r1, r2);
	}
	
	@Override
	public String toString() {
		return String.format("[cost: %d, weight: %d]", cost, weight);		
	}
}
