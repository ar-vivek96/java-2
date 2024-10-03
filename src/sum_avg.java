

//write a program to find sum and avg of given n number

import java.util.Scanner;

public class sum_avg {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=in.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		System.out.println("Enter the number "+i+" :");
		int a=in.nextInt();
		sum=sum+a;
		}
		System.out.println("Sum of Given number is "+sum);
		System.out.println("avg of Given number is "+sum/n);
		
		

	}

}
