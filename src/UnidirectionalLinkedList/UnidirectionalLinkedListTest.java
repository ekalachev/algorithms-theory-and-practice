package UnidirectionalLinkedList;

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
            System.out.println("Val: " + cell.value);
            actualSum += cell.value;
        }

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void max() {
        // Given
        UnidirectionalLinkedList list = new UnidirectionalLinkedList();

        list.addAtEnd(new Cell(5));
        list.addAtEnd(new Cell(9));
        list.addAtEnd(new Cell(7));

        // When
        int max = list.max();

        // Then
        assertEquals(9, max);
    }
}
