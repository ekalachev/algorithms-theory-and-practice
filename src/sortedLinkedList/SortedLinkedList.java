/*
  Algorithms. Theory and practice
  Chapter 3, Tasks 8
 */
package sortedLinkedList;

import java.util.Iterator;
import java.util.Random;

public class SortedLinkedList implements Iterable<Cell>  {
    private Cell top;
    private Cell bottom;
    private int count;

    public SortedLinkedList() {
        this.top = new Cell(Integer.MIN_VALUE);
        this.bottom = new Cell(Integer.MAX_VALUE);
        this.top.next = this.bottom;
        this.bottom.previous = this.top;
        this.count = 0;
    }

    // task 8
    public void insert(Cell newCell) {
        Cell cell = this.top;

        while (cell.next.value < newCell.value) {
            cell = cell.next;
        }

        insertCell(cell, newCell);

        this.count++;
    }

    private void insertCell(Cell afterMe, Cell newCell) {
        newCell.next = afterMe.next;
        afterMe.next = newCell;

        newCell.previous = afterMe;
    }

    // task 9
    public boolean isSorted() {
        Cell cell = this.top;

        while (cell.next.next != null) {
            if (cell.value > cell.next.value)
                return false;

            cell = cell.next;
        }

        return true;
    }

    // for task 9
    public void shuffleValues() {
        Cell cell = this.top.next;

        Random rand = new Random();

        while (cell.next != null) {
            int j = rand.nextInt(this.count);

            Cell cell2 = this.top.next;
            int index = 0;
            while (index < j) {
                cell2 = cell2.next;
                index++;
            }

            int tmp = cell.value;
            cell.value = cell2.value;
            cell2.value = tmp;

            cell = cell.next;
        }
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
