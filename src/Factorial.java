import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); // 5
		int f=1;
		for(int i=1;i<=n;i++)   //1<=5 2<=5 3<=5 4<=5 5<=5
		{  
			f=f*i;  // 1*1=1  1*2=2 3*2=6 4*6=24 5*24=120
		}
		System.out.println("Factorial:"+f);
	}

}
