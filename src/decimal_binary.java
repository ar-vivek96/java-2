import java.util.Scanner;
public class decimal_binary {
	//decimal to binary
	public static void deci2Bin(int n)
	{
		int binarynum[]=new int[1000];
		int i=0;
		while(n>0)
		{
			binarynum[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binarynum[j]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Decimal Number:");
		int n=in.nextInt();
		System.out.println("Decimal number "+n);
		System.out.print("Binary number ");
		decimal_binary.deci2Bin(n);
		
		
		

	}

}
