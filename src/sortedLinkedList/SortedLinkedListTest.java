package sortedLinkedList;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SortedLinkedListTest {
    @Test
    public void insert() {
        // Given
        SortedLinkedList list = new SortedLinkedList();

        for (int i = 0; i < 10; i++) {
            list.insert(new Cell((int)(Math.random() * 100)));
        }

        // Then
        int val = 0;
        for(Cell cell : list) {
            assertTrue(cell.value >= val);
            val = cell.value;
        }
    }
}
