package stepicAlgorithms.coveringLinesByDots;

import javafx.scene.shape.Line;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CoveringLinesByDotsTest {
    @Test
    public void cover() {
        // Given
        CoveringLinesByDots covering = new CoveringLinesByDots();

        // When
        ArrayList<Line> lines = new ArrayList<>();
        lines.add(new Line(4, 0, 7, 0));
        lines.add(new Line(1, 0, 3, 0));
        lines.add(new Line(2, 0, 5, 0));
        lines.add(new Line(5, 0, 6, 0));

        ArrayList<Double> points = covering.cover(lines);

        // Then
        assertEquals(2, points.size());

        assertEquals(3.0, points.get(0), 0);
        assertEquals(6.0, points.get(1), 0);
    }
}
