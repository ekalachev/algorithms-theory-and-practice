package stepikAlgorithms.PriorityQueue;

import java.util.Arrays;

public class MaxPQ {
	int capacity;
	int size;
	int[] heap;

	public MaxPQ() {
		capacity = 10;
		size = 0;
		heap = new int[capacity];
	}

	public int extractMax() {
		int max = heap[0];
		heap[0] = heap[size - 1];
		size--;
		siftDown(0);

		return max;
	}

	public void insert(int key) {
		ensureExstraCapacity();
		size++;
		heap[size - 1] = key;
		siftUp(size - 1);
	}

	private void siftDown(int i) {
		while (leftChild(i) < size) {
			int left = leftChild(i);
			int right = rightChild(i);
			int j = left;

			if (right < size && heap[right] > heap[left])
				j = right;

			if (heap[i] >= heap[j])
				break;

			swap(i, j);
			i = j;
		}
	}

	private int leftChild(int i) {
		return 2 * i + 1;
	}

	private int rightChild(int i) {
		return 2 * i + 2;
	}

	private int parent(int i) {
		return (i - 1) / 2;
	}

	private void siftUp(int i) {
		while (heap[i] > heap[parent(i)]) {
			swap(i, parent(i));
			i = parent(i);
		}
	}

	private void swap(int i, int j) {
		int tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

	private void ensureExstraCapacity() {
		if (size == capacity) {
			capacity *= 2;
			heap = Arrays.copyOf(heap, capacity);
		} else if (size > 0 && size == heap.length / 4) {
			capacity = capacity / 2;
			heap = Arrays.copyOf(heap, capacity);
		}
	}
}
