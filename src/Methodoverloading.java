class Mathoperation
{
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	public static double multiply(double n,double m)      // method overloading
	{
		return n*m;
	}
	public static double multiply(double i,int j)
	{
		return i*j;
	}
	public static int multiply(int r)
	{
		return r*r;
	}
}
public class Methodoverloading {

	public static void main(String[] args) {
		
		System.out.println("integer mul "+Mathoperation.multiply(2,3));
		System.out.println("Double mul "+Mathoperation.multiply(2.56,3.567));
		System.out.println("double and int mul "+Mathoperation.multiply(2.99,3));
		System.out.println("integer mul "+Mathoperation.multiply(2));
		

	}

}
