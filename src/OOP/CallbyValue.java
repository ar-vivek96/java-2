package OOP;


public class CallbyValue {
	static void increment(int a)
	{
		a++;
	}

	public static void main(String[] args) {
	
		int a=10;
		increment(a);//call by value
		increment(a);
		System.out.println(a);
		

	}

}
