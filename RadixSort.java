package sortingAlgorithms;

public class RadixSort {

	public static void main(String[] args) {
		int[] array = {13,112,233,103,3,9,34,22,92,2,5,12,};
		array = sort(array);
		for (int x : array) {
			System.out.println(x);
		}

	}
	
	public static int[] sort(int[] array) {
		int n = array.length;
		int max = array[0];
		int pos = 1;
		
		// get maximum of the array
		for(int i = 0; i < n; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		while(max / pos > 0) {
		    array = countSort(array, n, pos);
			pos *= 10;
		}
		
		return array;
		
	}

	private static int[] countSort(int[] array, int n, int pos) {
		
		int[] b = new int[n];
		int[] count = new int[10];
		
		for(int i = 0; i < n; i++) {
			count[(array[i] / pos) % 10]++;
		}
		
		// update count
		for(int i = 1; i < 10; i++) {
			count[i] = count[i] + count[i - 1];
		} 
		
		for(int i = n - 1; i >= 0; i--) {
			 b[--count[(array[i] / pos) % 10]] = array[i];
			
		}
		return b;
		
	}

}

// time is O(d*(n + k), here k is 10 --- d is number of digit in maximum element; n input size
// space is O(n)
