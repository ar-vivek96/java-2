
public class Print_prime {///print prime number 1 t0 999

	public static void main(String[] args) {
		
		int n,f=0;
	
		for(n=1;n<=999;n++)
		{
			for(int i=1;i<=n;i++)
			{
			if(n%i==0)
			{
				f++;
			}
			}
		
		if(f==2)
		{
			System.out.println(n+"is a prime number");
		}
		f=0;
			}	
		
	}

}
