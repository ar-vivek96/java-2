import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		
		int n,f=0;
		System.out.println("Enter Number:");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				f++;
			}
			
		}
		if(f==2)
		{

			System.out.println("prime NUmber");	
		}
		else
		{
			System.out.println("NOt a prime");
		}

	}

}
