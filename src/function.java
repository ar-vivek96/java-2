class Methods     //subclass
{
	public void add()   //no return without arg
	{
		int a=123;
		int b=10;
		System.out.println("Addition: "+(a+b));
	}
	public void sub(int x,int y)
	{
		System.out.println("Subtraction: "+(x-y));
	}
	
	public int mul()//retrun without args
	{
		int a=10;
		int b=123;
		return a*b;
	
	}
	public float div(int x,int y)//return with args
	{
		return x/y;
	}
	public int fact(int n)//recursion
	{
		if(n==1)
		{
			return 1;
		}
		else
		return n*fact(n-1);
	}
}

public class function {                        //main class
	//user defined methods in java
	public static void main(String[] args) {
		
		Methods o=new Methods();
		o.add();
		o.sub(123,10);
		System.out.println("Mul: " +o.mul());
		System.out.println("div: "+o.div(123, 10));
		System.out.println("Factorial "+o.fact(5));
		
		
	}

}
