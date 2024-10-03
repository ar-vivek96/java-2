import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int rev=0;
		while(n!=0)
		{
			rev=(rev*10)+n%10;   //123 ->3+(3*10+2)+(32*10+1)=321 
			n=n/10;
		}
		System.out.println("Reverse "+rev);
		

	}

}
