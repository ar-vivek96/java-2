import java.util.Scanner;

public class For_loop {
	public static void main(String args[])
	{
		System.out.println("Enter Limit: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
