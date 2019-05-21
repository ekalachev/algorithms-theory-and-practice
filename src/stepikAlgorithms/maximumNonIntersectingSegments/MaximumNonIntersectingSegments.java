package stepikAlgorithms.maximumNonIntersectingSegments;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class MaximumNonIntersectingSegments {
    public ArrayList<Point> find(ArrayList<Point> arr) {
        arr.sort(Comparator.comparingInt(line -> line.y));

        ArrayList<Point> arr2 = new ArrayList<>();
        Point cur = null;
        for (Point p: arr) {
            if (cur == null || cur.y <= p.x) {
                cur = p;
                arr2.add(p);
            }
        }

        return arr2;
    }
}
