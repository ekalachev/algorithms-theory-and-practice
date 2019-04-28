package sortedLinkedList;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class SortedLinkedListTest {
    @Test
    public void insert() {
        // Given
        SortedLinkedList list = new SortedLinkedList();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.insert(new Cell(rand.nextInt()));
        }

        // Then
        int val = Integer.MIN_VALUE;
        for(Cell cell : list) {
            assertTrue(cell.value >= val);
            val = cell.value;
        }
    }

    @Test
    public void isSorted() {
        // Given
        SortedLinkedList list = new SortedLinkedList();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.insert(new Cell(rand.nextInt()));
        }

        // Then
        assertTrue(list.isSorted());
        list.shuffleValues();
        assertFalse(list.isSorted());
    }
}
