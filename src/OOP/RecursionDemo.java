package OOP;

public class RecursionDemo {

	static int fact(int a)
	{
		if(a==0)
			return 1;
		else
		{
			return a*fact(a-1);
		}
	}
	
	
	public static void main(String[] args) {
		
		int n=5;
		System.out.println("Factorial:"+fact(n));
		
		
	}

}
