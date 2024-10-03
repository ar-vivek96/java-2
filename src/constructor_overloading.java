//parameterized COstructor &overlOading
class Box5
{
	float length,breadth;
	public Box5()               // Default constructor
	{
		length=2;
		breadth=5;
	}
	public Box5(float x,float y)     //parameterized constructor
	{
		length=x;
		breadth=y;
	}
	public Box5(float x)
	{
		length=breadth=x;
	}
	float area()
	{
		return length*breadth;
	}
}


public class constructor_overloading {

	public static void main(String[] args) {
		
		
		Box5 o=new Box5();
		System.out.println("Area "+o.area());
		Box5 o1=new Box5(3,6);
		System.out.println("Area "+o1.area());
		Box5 o2=new Box5(3);
		System.out.println("Area "+o2.area());
		



	}

}
