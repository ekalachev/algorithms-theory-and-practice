package minimumSwaps;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwapsTest {

    @Test
    public void minimumSwaps() {
        // Given
        MinimumSwaps ms = new MinimumSwaps();
        int[] arr = new int[]{1, 3, 5, 2, 4, 6, 7};
        int expectedResult = 3;

        // When
        int result = ms.minimumSwaps(arr);

        // Then
        assertEquals(expectedResult, result);
    }

    @Test
    public void sort() {
        // Given
        MinimumSwaps ms = new MinimumSwaps();
        int[] arr = new int[]{1, 3, 5, 2, 4, 6, 7};

        // When
        int[] result = ms.sort(arr);

        // Then
        for (int i = 0; i < 7; i++) {
            assertEquals(i + 1, result[i]);
        }
    }
}
