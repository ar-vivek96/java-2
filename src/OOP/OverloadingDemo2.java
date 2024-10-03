package OOP;

public class OverloadingDemo2 {

	static void test()
	{
		System.out.println("Method with no argument");
	}
	static void test(int a)
	{
		System.out.println("Method with one argument");
	}
	static void test(int a,int b)
	{
		System.out.println("Method with two argument");	
	}
	
	
	public static void main(String[] args) {
	  
		test();
		test(5,6);
		test(5);

	}

}
