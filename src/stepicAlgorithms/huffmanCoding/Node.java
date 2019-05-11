package stepicAlgorithms.huffmanCoding;

public class Node {
    char letter;
    int weight;

    Node left, right;

    public Node(char letter, int weight) {
        this.letter = letter;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
}
