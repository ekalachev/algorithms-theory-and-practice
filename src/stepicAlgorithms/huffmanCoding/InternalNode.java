package stepicAlgorithms.huffmanCoding;

public class InternalNode extends Node {
	Node left;
	Node right;
	
	public InternalNode(Node left, Node right) {
		super(left.sum + right.sum);
		
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void buildcode(String code) {
		super.buildcode(code);
		this.left.buildcode(code + "0");
		this.right.buildcode(code + "1");
	}
}
