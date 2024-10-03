import java.util.Scanner;

public class even_odd {
	
	//count odd and even in array
	public static void main(String args[])
	{
		int e=0,o=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a["+ i +"] value:");
			a[i]=in.nextInt();
		}
		for(int b:a)
		{
			if(b%2==0)
			{
				e++;
			}
			else
				o++;
		
		}
		System.out.println("Even numbers:"+e);
		System.out.println("odd number:"+o);
	}

}
