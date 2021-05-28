package sortingAlgorithms;

public class CountingSort {

	public static void main(String[] args) {
		int[] array = {3,2,3,3,3,3,33,12,2,2,2,12,12,};
		array = sort(array);
		for (int x : array) {
			System.out.println(x);
		}
	}
	
	public static int[] sort(int[] array) {
		
		int n = array.length;
		int max = array[0];
		
		// lets find max element in the array
		for(int i = 1; i < n; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		// create an array in the range 0 to max
		int[] count = new int[max + 1];
		
		// frequency of each element/key
		for(int i = 0; i < n; i++) {
			count[array[i]]++;
		}
		
		// update  count array
		for(int i = 1; i <= max ; i++) {
			count[i] = count[i] + count[i - 1];
		}
		
		// create new array to store sorted list
		int[] b = new int[n];
		
		// we start from last to maintain stability
		for(int i = n - 1; i >= 0; i--) {
			b[--count[array[i]]] = array[i];	
		}
		return b;  
	}

}


// time is O(n + k) and space is O(n + k)
// use this only when k is like 2n n 3n but not n^2 or above
// bco this complexity is n^2 or above also the space
