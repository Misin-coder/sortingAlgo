package sortingAlgorithms;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {10,10,5,};
		sort(array, 0, 2);
		for (int x : array) {
			System.out.println(x);
		}
	}
	
	public static void sort(int[] array, int start, int end) {
		if (start >= end) {
			return;
		}
		
		int pivotIndex = partition(array, start, end);
		sort(array, start, pivotIndex - 1);
		sort(array, pivotIndex + 1, end);	
	}
	
	public static int partition(int[] array, int start , int end) {
		int j = 0;
		int length = array.length;
		int pivot = array[end];
		
		for(int i = 0; i < length; i++) {
			if(array[i] < pivot) {
				swap(i, j, array);
				j++;		
			}
		}
		swap(end, j, array);
		return j;
	}
	
	private static void swap(int i, int min, int[] array) {
		int temp = array[i];
		array[i] = array[min];
		array[min] = temp;	
	}

}

// pivot selection criteria is last element as pivot 
// time is O(nlogn), space is O(1)
// un stable and inplace
