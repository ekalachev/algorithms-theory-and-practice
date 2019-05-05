/*
  Algorithms. Theory and practice
  Chapter 3, Tasks 12
  Turtle and Rabbit.
  1. Run turtle from the beginning of the list with speed = 1 cell per step
     and rabbit from the beginning of the list with speed = 2 cells per step
  2. If the rabbit found a null cell, the list does not contain a cycle
  3. If rabbit caught up the turtle, move the rabbit to the beginning of the list with speed 1 cell per step
  4. When the rabbit and the turtle will meet again, they will be at the beginning of the cycle.
     Then stop the rabbit. When the turtle.next will be an equal rabbit, it will be the end of the cycle.
  5. For interruption of the cycle, set NULL for turtle.next.
 */
package turtleAndRabbit;

import java.util.Iterator;

public class TurtleAndRabbit implements Iterable<Cell> {
    private Cell top;
    private Cell bottom;

    public TurtleAndRabbit() {
        this.top = new Cell(0);
        this.bottom = this.top;
    }

    public void add(Cell cell) {
        this.bottom.next = cell;
        this.bottom = cell;
    }

    public boolean findCycle() {
        Cell rabbit = this.top;
        Cell turtle = this.top;
        int rabbitSteps = 2;

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle.next;

            for (int i = 0; i < rabbitSteps; i++) {
                rabbit = rabbit.next;
            }

            if (rabbit == turtle) {
                if (rabbitSteps == 2) {
                    rabbit = this.top;
                    rabbitSteps--;
                } else {
                    turtle.next = null;
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public Iterator<Cell> iterator() {
        return new CellIterator();
    }

    public class CellIterator implements Iterator<Cell> {
        private Cell current;

        public CellIterator() {
            this.current = top;
        }

        @Override
        public boolean hasNext() {
            return this.current.next != null;
        }

        @Override
        public Cell next() {
            this.current = this.current.next;
            return this.current;
        }
    }
}
