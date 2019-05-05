/*
  Algorithms. Theory and practice
  Multithreaded Linked List
  Chapter 3, Tasks 11
 */
package multithreadedLinkedList;

import java.util.Iterator;

public class MultithreadedLinkedList implements Iterable<Planet> {
    private Planet top;
    private SortBy iteratorType;

    MultithreadedLinkedList() {
        this.top = new Planet(null, 0, 0, 0);
        this.iteratorType = SortBy.DistanceToSun;
    }

    void addPlanetToList(Planet planet) {
        sortByDiameter(planet, this.top);

        sortByDistanceToSun(planet, this.top);

        sortByMass(planet, this.top);
    }

    private void sortByMass(Planet planet, Planet next) {
        while (true) {
            if (next.nextMass == null || next.nextMass.getMass() > planet.getMass()) {
                planet.nextMass = next.nextMass;
                next.nextMass = planet;
                break;
            }

            next = next.nextMass;
        }
    }

    private void sortByDistanceToSun(Planet planet, Planet next) {
        while (true) {
            if (next.nextDistanceToSun == null || next.nextDistanceToSun.getDistanceToSun() > planet.getDistanceToSun()) {
                planet.nextDistanceToSun = next.nextDistanceToSun;
                next.nextDistanceToSun = planet;
                break;
            }

            next = next.nextDistanceToSun;
        }
    }

    private void sortByDiameter(Planet planet, Planet next) {
        while (true) {
            if (next.nextDiameter == null || next.nextDiameter.getDiameter() > planet.getDiameter()) {
                planet.nextDiameter = next.nextDiameter;
                next.nextDiameter = planet;
                break;
            }

            next = next.nextDiameter;
        }
    }

    void sortBy(SortBy iteratorType) {
        this.iteratorType = iteratorType;
    }

    public enum SortBy {
        Mass,
        DistanceToSun,
        Diameter
    }

    @Override
    public Iterator<Planet> iterator() {
        return new PlanetIterator();
    }

    public class PlanetIterator implements Iterator<Planet> {
        private Planet current;

        PlanetIterator() {
            this.current = top;
        }

        @Override
        public boolean hasNext() {
            switch (iteratorType) {
                case Mass:
                    return this.current.nextMass != null;

                case Diameter:
                    return this.current.nextDiameter != null;

                default:
                    return this.current.nextDistanceToSun != null;
            }
        }

        @Override
        public Planet next() {
            switch (iteratorType) {
                case Mass:
                    this.current = this.current.nextMass;
                    break;

                case Diameter:
                    this.current = this.current.nextDiameter;
                    break;

                default:
                    this.current = this.current.nextDistanceToSun;
                    break;
            }

            return this.current;
        }
    }
}
