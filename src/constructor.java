
class Rectangle
{
	int length,width;
	Rectangle()						// default constructor
	{
		System.out.println("Constructor Called");
		length=2;
		width=10;
	}
	int area()
	{
		int a=length*width;
		return a;
	}
	
}

public class constructor {

	public static void main(String[] args) {

		Rectangle o1=new Rectangle();
		System.out.println("Area "+o1.area());
		

	}

}
