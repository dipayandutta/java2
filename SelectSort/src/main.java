/*
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
 * (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

	In every iteration of selection sort, 
	the minimum element (considering ascending order) from the 
	unsorted subarray is picked and moved to the sorted subarray. 
 * 
 * 
 */

class SelectionSort {
	void sort(int arr[]) {
		/*First print the array for testing*/
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		/*Sorting Process Starts for here*/
	}
}
public class main {
	
	public static void main(String args[]) {
		
		/*Define the array to sort*/
		int arr[] = {64,25,12,22,11};
		/*Creation Object of the SelectionSort Class*/
		SelectionSort sort_array = new SelectionSort();
		sort_array.sort(arr);
	}

}
