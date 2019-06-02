package stepikAlgorithms.sort.mergeSort.inversionCounter;

public class InversionCounter {
	public int sort(int[] arr) {
		int[] tmpArr = new int[arr.length];
		return sort(arr, tmpArr, 0, arr.length - 1);
	}

	private int sort(int[] arr, int[] tmpArr, int start, int end) {
		int inversionCounter = 0;

		if (start == end)
			return inversionCounter;

		int mid = (end + start) / 2;

		inversionCounter = sort(arr, tmpArr, start, mid);
		inversionCounter += sort(arr, tmpArr, mid + 1, end);

		inversionCounter += merge(arr, tmpArr, start, mid, end);

		return inversionCounter;
	}

	private int merge(int[] arr, int[] tmpArr, int start, int mid, int end) {
		int leftIndex = start;
		int rightIndex = mid + 1;
		int tmpIndex = leftIndex;
		int inversionCounter = 0;

		while (leftIndex <= mid && rightIndex <= end) {
			if (arr[leftIndex] <= arr[rightIndex]) {
				tmpArr[tmpIndex] = arr[leftIndex];
				leftIndex++;
			} else {
				tmpArr[tmpIndex] = arr[rightIndex];
				rightIndex++;
				
				inversionCounter = inversionCounter + (mid + 1 - leftIndex);
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

		return inversionCounter;
	}
}
