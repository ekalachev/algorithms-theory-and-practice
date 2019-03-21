import java.util.Random;

public class RandomizeArray<Item> {
    public void Randomize(Item[] array) {
        if (array == null)
            return;

        int n = array.length;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(n);
            Item temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
