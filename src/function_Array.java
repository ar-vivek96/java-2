import java.util.Arrays;
import java.util.Scanner;

public class function_Array {
	
	public static int[] sortArray()
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit:");
		 n=in.nextInt();
		 int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("value of array"+i+":");
			a[i]=in.nextInt();
		}
		 Arrays.sort(a);
		 return a;
		
	}

	public static void main(String[] args) {
		
		int[] arr=sortArray();
		for(int x:arr)
		{
			System.out.println(x);
		}
		
		
		

	}

}
