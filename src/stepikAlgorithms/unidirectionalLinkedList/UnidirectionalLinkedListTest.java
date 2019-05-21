package stepikAlgorithms.unidirectionalLinkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnidirectionalLinkedListTest {
    @Test
    public void addAtEnd() {
        // Given
        UnidirectionalLinkedList list = new UnidirectionalLinkedList();

        // When
        int expectedSum = 0;
        for (int i = 1; i <= 10; i++) {
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
    public void max() {
        // Given
        UnidirectionalLinkedList list = new UnidirectionalLinkedList();

        int expectedValue = 9;

        list.addAtEnd(new Cell(5));
        list.addAtEnd(new Cell(expectedValue));
        list.addAtEnd(new Cell(7));

        // When
        int max = list.max();

        // Then
        assertEquals(expectedValue, max);
    }
}
