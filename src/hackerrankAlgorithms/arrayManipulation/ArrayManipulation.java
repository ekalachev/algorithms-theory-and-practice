/*
 	Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array
 	element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.
	For example, the length of your array of zeros n = 10. Your list of queries is as follows:
	a b k
	1 5 3
	4 8 7
	6 9 1
    
    Add the values of 'k' between the indices 'a' and 'b' inclusive:
	index->	 
			 1 2 3  4  5 6 7 8 9 10
			[0,0,0, 0, 0,0,0,0,0, 0]
			[3,3,3, 3, 3,0,0,0,0, 0]
			[3,3,3,10,10,7,7,7,0, 0]
			[3,3,3,10,10,8,8,8,1, 0]
	The largest value is 10 after all operations are performed.
 */
package hackerrankAlgorithms.arrayManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import common.Pair;

public class ArrayManipulation {
	/*
	 	Optimal SOLUTION O(n):
		Given a range[a, b] and a value 'k' we need to add 'k' to all the numbers whose indices are in the range from [a, b].
		We can do an O(1) update by adding 'k' to index 'a' and add '-k' to index 'b+1'.
		Doing this kind of update, the 'i'th number in the array will be prefix sum of array from index 1 to i because we are
		adding 'k' to the value at index 'a' and subtracting 'k' from the value at index 'b+1' and taking prefix sum will give
		us the actual value for each index after 'm' operations .
		So, we can do all 'm' updates in O(m) time. Now we have to check the largest number in the original array.
		i.e. the index i such that prefix sum attains the maximum value.
		We can calculate all prefix sums as well as maximum prefix sum in O(n) time which will execute in time.
	 */
	public long arrayManipulation(int n, int[][] queries) {
		int m = queries.length;
		long[] arr = new long[n];

		for (int i = 0; i < m; i++) {
			int from = queries[i][0] - 1;
			int to = queries[i][1];
			int num = queries[i][2];

			arr[from] += num;
			if (to < n)
				arr[to] -= num;
		}

		long max = 0, sum = 0;

		for (long i : arr) {
			sum += i;
			if (max < sum)
				max = sum;
		}

		return max;
	}

	/*
		Optimal SOLUTION O(m log m):
		This can be further optimized to run in O(m log m) time because we have to check the value of prefix sum
		at only '2 * m' indices. i.e. 'a' and 'b' values of all the updates.
		We have, in total 'm' queries and each query has a range [a, b] which needs to be updated.
		So, in total we have '2 * m' indices.
		For each query, we can insert both 'a', 'k' and 'b + 1', '-k' in an array and sort the array.
		Now, we have to just take the prefix sum of the array and find the maximum element which will be our answer.
	 */
	// TODO fix for test: given_gueries2_of_ranges_with_sums_When_arrayManipulation2_then_returns_max_sum
	public long arrayManipulation2(int n, int[][] queries) {
		int m = queries.length;

		Vector<Pair<Integer, Integer>> arr = new Vector<>();

		for (int i = 0; i < m; i++) {
			int from = queries[i][0] - 1;
			int to = queries[i][1];
			int num = queries[i][2];

			arr.add(new Pair<Integer, Integer>(from, num));
			arr.add(new Pair<Integer, Integer>(to + 1, -num));
		}

		Collections.sort(arr, Comparator.comparing(Pair<Integer, Integer>::getKey));

		long max = 0, sum = 0;

		for (int i = 0; i < 2 * m; i++) {
			sum += (long) arr.get(i).getValue();
			max = Math.max(sum, max);
		}

		return max;
	}
}
