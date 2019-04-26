/**
 * Algorithms. Theory and practice
 * Chapter 3, Tasks 1, 2
 */
package UnidirectionalLinkedList;

import java.util.Iterator;

public class UnidirectionalLinkedList implements Iterable<Cell> {
    private Cell top;
    private Cell bottom;

    public UnidirectionalLinkedList() {
        this.top = new Cell(0);
        this.bottom = this.top;
    }

    // task 1
    public void addAtEnd(Cell newCell) {
        this.bottom.next = newCell;
        this.bottom = this.bottom.next;
        this.bottom.next = null;
    }

    // task 2
    public int max() {
        int max = 0;
        Cell cell = this.top;

        while (cell.next != null) {
            if(max < cell.next.value) {
                max = cell.next.value;
            }

            cell = cell.next;
        }

        return max;
    }

    @Override
    public Iterator iterator() {
        return new CellIterator();
    }

    public class CellIterator implements Iterator<Cell>{
        private Cell current;

        public CellIterator(){
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
