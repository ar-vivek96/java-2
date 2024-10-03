import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		
		System.out.println("Enter the Limit:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=-1,b=1;
		int c;
		for(int i=1;i<=n;i++)
		{
	  		c=a+b;// 0  1   1 2  3 
   			a=b;  // 1  0   1  1 
			b=c; //  0  1   1  2
			System.out.println(c);
		}
		
		
	}

}
