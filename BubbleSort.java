package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 10, 10, 5, 3, 1, 6, 9 };
		sort(array);
		for (int x : array) {
			System.out.println(x);
		}

	}

	public static void sort(int[] array) {
		int length = array.length;
		
		for(int i = 0; i < length - 1; i++) {
			boolean swap = false;
			for(int j = 0; j < length - i - 1; j++) {
				if (array[j+1] < array[j]) {
					swap(j+1, j, array);
					swap = true;
				}
			}
			if ( !swap) {
				return;
			}
		}
		// time is O(n^2), space is O(1)
		// stable
		//inplace
	}
	
	private static void swap(int i, int min, int[] array) {
		int temp = array[i];
		array[i] = array[min];
		array[min] = temp;
 		
	}

}
