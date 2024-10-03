import java.util.Scanner;

public class strong_number {

	public static void main(String[] args) {

		int n,temp,rem,i,fact,sum=0;
		System.out.println("Enter number:");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10; //145%10->5->4->1
			fact=1;
			for(i=1;i<=rem;i++)
			{
				fact=fact*i;    //rem->5=1*1->1*(1*2*3*4*5
			}
			sum=sum+fact;
			
			n=n/10; ///145/10->14->1->0
		}
		if(sum==temp)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}

}
