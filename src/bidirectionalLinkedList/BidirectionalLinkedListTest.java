package bidirectionalLinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class BidirectionalLinkedListTest {
    @Test
    public void addAtEnd() {
        // Given
        BidirectionalLinkedList list = new BidirectionalLinkedList();
        int expectedVal = 5;

        list.addAtEnd(new Cell(1));
        list.addAtEnd(new Cell(3));
        list.addAtEnd(new Cell(expectedVal));

        // When
        int last = list.last();

        // Then
        assertEquals(expectedVal, last);
    }

    @Test
    public void addAtBegining() {
        // Given
        BidirectionalLinkedList list = new BidirectionalLinkedList();
        int expectedValue = 9;

        list.addAtEnd(new Cell(5));
        list.addAtEnd(new Cell(7));
        list.addAtBegining(new Cell(expectedValue));

        // When
        int first = list.first();

        // Then
        assertEquals(expectedValue, first);
    }

    @Test
    public void remove() {
        // Given
        BidirectionalLinkedList list = new BidirectionalLinkedList();
        Cell removingCell = new Cell(9);

        list.addAtEnd(new Cell(5));
        list.addAtEnd(removingCell);
        list.addAtEnd(new Cell(7));

        // When
        list.remove(removingCell);

        // Then
        for (Cell cell : list) {
            assertNotEquals(cell.value, removingCell.value);
        }
    }
}
