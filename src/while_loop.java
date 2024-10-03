import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {

		int n;
		System.out.println("Enter Limit:");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}

	}

}
