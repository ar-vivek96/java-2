package dataStructrue;

import java.util.Arrays;

public class DemoLinear {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(LinearSearch.find(arr, 4));
		System.out.println(LinearSearch.contains(arr, 4));
		String arr1[]= {"Anbu","vivek","Rani"};
		String name="vivek";
		System.out.println(LinearSearch.find(arr1,name));
		System.out.println(LinearSearch.find(name, 'v'));
		System.out.println(LinearSearch.contains(name, 'k'));
		int a[][]={{1,2,3},
				{4,5,6},
				{7,8,9}};
		int result[]=LinearSearch.find(a,9);
		System.out.println(Arrays.toString(result));
		for(int i=0;i<result.length;i++)
		{
			System.out.print(" "+result[i]);
		}
	
	}

}
