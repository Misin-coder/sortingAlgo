package sortingAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {10,10,5};
		sort(array, 0, 2);
		for (int x : array) {
			System.out.println(x);
		}

	}
	
	public static void sort(int[] array, int start, int end) {
		
		if (start >= end) {
			return ;
		}
		
		int mid = start + (end - start) / 2;
		sort(array, start, mid);
		sort(array, mid + 1, end);
		twoWayMerge(start, end, mid, array);
		
	}

	private static void twoWayMerge(int start, int end, int mid, int[] array) {
		int leftSize = (mid - start) + 1;
		int rightSize = end - mid;
		int[] larray = new int[leftSize];
		int[] rarray = new int[rightSize];
		
		for(int i = 0; i < leftSize; i++) {
			larray[i] = array[start + i];
		}
		
		for(int j = 0; j < rightSize; j++) {
			rarray[j] = array[mid + 1 + j];
		}
 		
		int i, j;
		i = j = 0;
		
		while( i < leftSize && j < rightSize) {
			
			if(larray[i] < rarray[j] ) {
				array[start] = larray[i];
				i++;
				
			} else {
				array[start] = rarray[j];
				j++;
				
			}
			start++;
			
		}
		
		while(i < leftSize) {
			array[start] = larray[i];
			i++;
			start++;
		}
		
		while(j < rightSize) {
			array[start] = rarray[j];
			j++;
			start++;
		}
		
	}

}

// time complexity is O(nlogn) and space is O(n)
// not inplace as require additional space for array
// stable
