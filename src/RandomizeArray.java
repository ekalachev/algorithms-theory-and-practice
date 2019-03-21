import java.util.Random;

public class RandomizeArray<Item> {
    public void Randomize(Item[] array) {
        if (array == null)
            return;

        int n = array.length;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(n);
            exchange(array, i, j);
        }
    }

    private void exchange(Item[] array, int i, int j) {
        Item temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
