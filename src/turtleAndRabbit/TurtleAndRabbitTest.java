package turtleAndRabbit;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class TurtleAndRabbitTest {
    private TurtleAndRabbit tr;

    @Before
    public void setUp() throws Exception {
        this.tr = new TurtleAndRabbit();
    }

    @Test
    public void linkedListWithoutCycle() {
        // Given
        int[] expectedArr = new int[]{1, 2, 3, 4, 5};
        int index = 0;

        // When
        for (int i = 1; i <= 5; i++)
            this.tr.add(new Cell(i));

        // Then
        assertFalse(this.tr.findCycle());

        for (Cell cell : this.tr) {
            assertEquals(expectedArr[index], cell.value);
            index++;
        }
    }

    @Test
    public void linkedListWithCycle() {
        // Given
        int[] expectedArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index = 0;
        Cell cell4 = new Cell(4);
        Cell cell8 = new Cell(8);

        // When

        for (int i = 1; i <= 7; i++)
            if (i == 4)
                this.tr.add(cell4);
            else
                this.tr.add(new Cell(i));

        this.tr.add(cell8);
        cell8.next = cell4;

        // Then
        assertTrue(this.tr.findCycle());

        for (Cell cell : this.tr) {
            assertEquals(expectedArr[index], cell.value);
            index++;
        }
    }
}
