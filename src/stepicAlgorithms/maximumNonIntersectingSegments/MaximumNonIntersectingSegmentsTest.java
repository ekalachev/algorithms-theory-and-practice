package stepicAlgorithms.maximumNonIntersectingSegments;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MaximumNonIntersectingSegmentsTest {
    @Test
    public void find() {
        // Given
        MaximumNonIntersectingSegments mnis = new MaximumNonIntersectingSegments();
        ArrayList<Point> arr = new ArrayList<>();
        arr.add(new Point(1,3));
        arr.add(new Point(2,5));
        arr.add(new Point(3,6));

        // When
        ArrayList<Point> resultArr = mnis.find(arr);

        // Then
        assertEquals(1, resultArr.get(0).x);
        assertEquals(3, resultArr.get(0).y);

        assertEquals(3, resultArr.get(1).x);
        assertEquals(6, resultArr.get(1).y);
    }
}
