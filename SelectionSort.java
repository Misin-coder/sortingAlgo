package sortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {10,10,5,3,1,6,9};
		stableSort(array);
		for (int x : array) {
			System.out.println(x);
		}

	}
	
	public static void sort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			swap(i, min, array);
		}
		// time is O(n^2) and space is O(1)
	}

	private static void swap(int i, int min, int[] array) {
		int temp = array[i];
		array[i] = array[min];
		array[min] = temp;
 		
	}
	
	public static void stableSort(int[] array) {
		
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (array[min] > array[j]) {
					min = j;
					
				}
			}
			int value = array[min];
			while (min > i) {
				array[min] = array[min - 1];
				min--;			
			}
			array[i] = value;
		}
		
	}

}

/* 
 * Selection sort is unstable because of swapping that swapping is making the order of same element unstable
 *  eg case like 9,9,9,1,1 and like 4,3,2,4,1
 * no extra space needed so inplace
 */

// to make stable instead of swapping we can do insert element at its position instead of swapping


