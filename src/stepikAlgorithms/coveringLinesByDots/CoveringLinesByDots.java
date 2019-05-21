/*
    Задача на программирование: покрыть отрезки точками

    По данным 𝑛 отрезкам необходимо найти множество точек минимального размера,
    для которого каждый из отрезков содержит хотя бы одну из точек.

    В первой строке дано число 1≤𝑛≤100 отрезков. Каждая из последующих 𝑛 строк содержит по два числа 0 <= n <= 100,
    задающих начало и конец отрезка. Выведите оптимальное число 𝑚 точек и сами 𝑚 точек.
    Если таких множеств точек несколько, выведите любое из них.
 */
package stepikAlgorithms.coveringLinesByDots;

import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.Comparator;

public class CoveringLinesByDots {
    ArrayList<Double> cover(ArrayList<Line> arr){
        arr.sort(Comparator.comparingDouble(line -> line.getEndX()));

        ArrayList<Double> points = new ArrayList<>();
        double p = arr.get(0).getEndX();
        points.add(p);

        while(arr.size() > 0) {
            if(arr.get(0).getStartX() <= p)
                arr.remove(0);
            else {
                p = arr.get(0).getEndX();
                points.add(p);
            }
        }

        return points;
    }
}
