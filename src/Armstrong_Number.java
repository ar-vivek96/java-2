

//write a program to find the armstrong number 100-900
public class Armstrong_Number {

	public static void main(String[] args) {
		
		int r=0;
		int t;
		
		for(int n=100;n<=200;n++)
		{
			t=n;
			r=r+(n%10)*(n%10)*(n%10);
			n=n/10;
			
			if(r==t)
			{
			System.out.println(n + " is an Armstrong number");
		}
			
		}

	}

}
