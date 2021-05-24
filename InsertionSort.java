package sortingAlgorithms;

public class InsertionSort {

	public static void main(String[] args) {

		int[] array = { 10, 10, 5, 3, 1, 6, 9 };
		sort(array);
		for (int x : array) {
			System.out.println(x);
		}

	}

	public static void sort(int[] array) {
		int length = array.length;
		for (int i = 1; i < length; i++) {
			int j = i - 1;
			int element = array[i];

			while (j >= 0 && array[j] > element) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = element;

		}
		// time O(n^2) , space O(1) }
		// stable bcoz no swapping
		// inplace

	}

}
