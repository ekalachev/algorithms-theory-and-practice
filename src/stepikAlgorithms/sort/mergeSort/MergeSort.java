package stepikAlgorithms.sort.mergeSort;

public class MergeSort {
	public void sort(int[] arr) {
		int[] tmpArr = new int[arr.length];
		sort(arr, tmpArr, 0, arr.length - 1);
	}

	private void sort(int[] arr, int[] tmpArr, int start, int end) {
		if (start == end)
			return;

		int mid = (end + start) / 2;

		sort(arr, tmpArr, start, mid);
		sort(arr, tmpArr, mid + 1, end);

		merge(arr, tmpArr, start, mid, end);
	}

	private void merge(int[] arr, int[] tmpArr, int start, int mid, int end) {
		int leftIndex = start;
		int rightIndex = mid + 1;
		int tmpIndex = leftIndex;

		while (leftIndex <= mid && rightIndex <= end) {
			if (arr[leftIndex] <= arr[rightIndex]) {
				tmpArr[tmpIndex] = arr[leftIndex];
				leftIndex++;
			} else {
				tmpArr[tmpIndex] = arr[rightIndex];
				rightIndex++;

			}

			tmpIndex++;
		}

		for (int i = leftIndex; i <= mid; i++) {
			tmpArr[tmpIndex] = arr[i];
			tmpIndex++;
		}

		for (int i = rightIndex; i <= end; i++) {
			tmpArr[tmpIndex] = arr[i];
			tmpIndex++;
		}

		for (int i = start; i <= end; i++) {
			arr[i] = tmpArr[i];
		}
	}
}