/*
 * Time complexity O (log n)
 */
package stepikAlgorithms.binarySearch;

import java.util.Arrays;

public class BinarySearch {
	public int search(int k, int[] array) {
		Arrays.sort(array);

		int l = 0, r = array.length - 1;

		while (l <= r) {
			int m = l + (r - l) / 2;
			if (array[m] == k) {
				return m;
			} else if (array[m] > k) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}

		return -1;
	}
}
