package sortingAlgorithms;

public class HeapSort {

	public static void main(String[] args) {
		int[] array = {1,2,5,10,5};
		sort(array);
		for (int x : array) {
			System.out.println(x);
		}

	}
	
	public static void sort(int[] array) {
		int length = array.length;
		
		for(int i = (length / 2) - 1; i >= 0; i--) {
			heapify(i, array, array.length);
		}
		
		for(int i = length - 1; i > 0; i--) {
			swap(i, 0, array);
			heapify(0, array,  i);
		}
		
	}

	public static void heapify(int index, int[] array, int n) {
		int largest = index;
		int left = (2 * index) + 1;
		int right = (2 * index) + 2;
		
		if(left < n && array[largest]  < array[left]) {
			largest = left;
		} 
		if(right < n && array[largest] < array[right]) {
			largest = right;
		}
		
		if(largest != index) {
			swap(largest, index, array);
			heapify(largest, array, n);
		}
		
	}

	private static void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
 		
	}
	
}
