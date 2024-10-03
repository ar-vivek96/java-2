//Hierarchical Inheritance in java
class Shape                     //base class
{
	float length,breadth,radius;
}
class Rectangle1 extends Shape   //derived class
{
	public Rectangle1(float l,float b)
	{
		length =l;
		breadth=b;
	}
	public float areaofrect() 
	{
		return length*breadth;
	}
}
class Circle extends Shape            //derived class
{ 
	public Circle(float r)
	{
		radius=r;
	}
	public float areaofcircle()
	{
		return (float)(3.14*radius*radius);
	}
}
class Square extends Shape              //derived class
{
	public Square(float l)
	{
		length=l;
	}
	float Squarearea()
	{
		return length*length;
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		
		Square n=new Square(3);
		Circle n1=new Circle(5);
		Rectangle1 n3=new Rectangle1(2,5);
		System.out.println("Area of square "+n.Squarearea());
		System.out.println("Area of Circle "+n1.areaofcircle());
		System.out.println("Area of REctangle "+n3.areaofrect());
		
		

	}

}
