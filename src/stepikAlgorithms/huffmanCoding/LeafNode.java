package stepikAlgorithms.huffmanCoding;

public class LeafNode extends Node {
	char symbol;
	
	public LeafNode(char symbol, int count) {
		super(count);
		
		this.symbol = symbol;
	}
}
