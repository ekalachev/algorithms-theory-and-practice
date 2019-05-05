package hackerrankAlgorithms.minimumSwaps;

public class MinimumSwaps {
    public int minimumSwaps(int[] arr) {
        int index = 0, swapCount = 0, last = arr.length - 1;

        while (index < last) {
            if (arr[index] == index + 1) {
                index++;
                continue;
            }

            swap(arr, arr[index] - 1, index);
            swapCount++;
        }

        return swapCount;
    }

    public int[] sort(int[] arr) {
        int index = 0, last = arr.length - 1;

        while (index < last) {
            if (arr[index] == index + 1) {
                index++;
                continue;
            }

            swap(arr, arr[index] - 1, index);
        }

        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
