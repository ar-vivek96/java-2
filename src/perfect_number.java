
//perfect number or not 

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("Enter Number:");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("perfect Number");
			
		}
		else
		{
			System.out.println("Not a perfect Number");
		}
		

	}

}
