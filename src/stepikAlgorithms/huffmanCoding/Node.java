package stepikAlgorithms.huffmanCoding;

public class Node implements Comparable<Node> {
    final int sum;
    String code;
    
    public Node(int sum) {
    	this.sum = sum;
    }
    
    public void buildcode(String code) {
    	this.code = code;
    }

	@Override
	public int compareTo(Node o) {
		return Integer.compare(sum, o.sum);
	}
}