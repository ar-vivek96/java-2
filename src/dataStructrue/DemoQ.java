package dataStructrue;

import java.util.Arrays;

public class DemoQ {

	public static void main(String[] args) {
		int arr1[]= {5,8,4,3,7,6,2,9,5};
		QSort.quickSort(arr1, 0, arr1.length-1);
		System.out.println(Arrays.toString(arr1));

	}

}
