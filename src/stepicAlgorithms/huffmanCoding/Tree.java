package stepicAlgorithms.huffmanCoding;

public class Tree {
    char letter;
    int weight;

    Tree left, right;

    public Tree(char letter, int weight) {
        this.letter = letter;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void addWeight(int weight) {
        this.weight += weight;
    }
}
