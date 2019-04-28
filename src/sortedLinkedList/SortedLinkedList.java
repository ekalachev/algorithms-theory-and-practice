/*
  Algorithms. Theory and practice
  Chapter 3, Tasks 8
 */
package sortedLinkedList;

import java.util.Iterator;

public class SortedLinkedList implements Iterable<Cell>  {
    private Cell top;
    private Cell bottom;

    public SortedLinkedList() {
        this.top = new Cell(Integer.MIN_VALUE);
        this.bottom = new Cell(Integer.MAX_VALUE);
        this.top.next = this.bottom;
        this.bottom.previous = this.top;
    }

    // task 8
    public void insert(Cell newCell) {
        Cell cell = this.top;

        while (cell.next.value < newCell.value) {
            cell = cell.next;
        }

        newCell.next = cell.next;
        cell.next = newCell;
    }

    @Override
    public Iterator<Cell> iterator() {
        return new CellIterator();
    }

    public class CellIterator implements Iterator<Cell> {
        private Cell current;

        CellIterator() {
            this.current = top;
        }

        @Override
        public boolean hasNext() {
            return this.current.next.next != null;
        }

        @Override
        public Cell next() {
            this.current = this.current.next;
            return this.current;
        }
    }
}
