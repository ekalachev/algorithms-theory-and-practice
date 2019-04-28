/*
  Algorithms. Theory and practice
  Chapter 3, Tasks 3, 4
 */
package bidirectionalLinkedList;

import java.util.Iterator;

class BidirectionalLinkedList implements Iterable<Cell> {
    private Cell top;
    private Cell bottom;

    public BidirectionalLinkedList() {
        this.top = new Cell(0);
        this.bottom = this.top;
    }

    // task 3
    public void addAtBegining(Cell newCell) {
        insertCell(this.top, newCell);
    }

    // task 4
    public void addAtEnd(Cell newCell) {
        insertCell(this.bottom, newCell);
        this.bottom = newCell;
    }

    // task 5
    private void insertCell(Cell afterMe, Cell newCell) {
        newCell.next = afterMe.next;
        afterMe.next = newCell;

        newCell.next = newCell;
        newCell.previous = afterMe;
    }

    public int first() {
        if (this.top.next == null)
            return this.top.value;

        return this.top.next.value;
    }

    public int last() {
        return bottom.value;
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
            return this.current.next != null;
        }

        @Override
        public Cell next() {
            this.current = this.current.next;
            return this.current;
        }
    }
}
