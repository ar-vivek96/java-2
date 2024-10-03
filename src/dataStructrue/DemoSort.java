package dataStructrue;

import java.util.Arrays;

public class DemoSort {

	public static void main(String[] args) {
	
		int arr[]= {9,4,7,1,6,2,8,4};
		arr=Sorting.mergeSort(arr);
		Sorting.mergeSortPlace(arr, 0,arr.length);;
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
