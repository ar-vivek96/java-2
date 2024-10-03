import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Table:");
		long t=in.nextInt();
		System.out.println("Enter limit:");
		long n=in.nextInt();
		for(long i=1;i<=n;i++)
		{
			System.out.println(i+" * "+t+" = "+(i*t));
			
		}
		
	}

}
