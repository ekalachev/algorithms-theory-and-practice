package bidirectionalLinkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BidirectionalLinkedListTest {
    @Test
    public void addAtEnd() {
        // Given
        BidirectionalLinkedList list = new BidirectionalLinkedList();

        // When
        int expectedSum = 0;
        for (int i = 1; i <= 5; i++) {
            int rand = (int) (Math.random() * 100);
            list.addAtEnd(new Cell(rand));
            expectedSum += rand;
        }

        // Then
        int actualSum = 0;
        for (Cell cell : list){
            actualSum += cell.value;
        }

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void addAtBegining() {
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
}
