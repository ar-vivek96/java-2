import java.util.Scanner;

public class Find_factors {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter Number");
		Scanner in=new Scanner(System.in);
		 n=in.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 if(n%i==0)
			 {
				 System.out.print(i+" ");
			 }
		 }
		

	}

}
