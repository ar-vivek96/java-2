package dataStructrue;

import java.util.Arrays;

public class DemoSelection {

	public static void main(String[] args) {
		
		int arr[]= {10,5,26,3,15,22};
		//Sort.selectionSort(arr);
		//Sort.bubbleSort(arr);
		Sort.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
