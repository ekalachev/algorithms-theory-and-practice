/*
  Algorithms. Theory and practice
  Chapter 3, Tasks 3
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

    public void addAtEnd(Cell newCell) {
        newCell.previous = this.bottom;

        if (this.bottom.previous == null) {
            this.bottom.previous = this.top;
        }

        this.bottom.next = newCell;
        this.bottom = this.bottom.next;
        this.bottom.next = null;
    }

    public void addAtBegining(Cell newCell) {
        newCell.next = this.top.next;
        this.top.next = newCell;
        newCell.previous = this.top;
    }

    public int first() {
        if (this.top.next == null)
            return this.top.value;

        return this.top.next.value;
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
