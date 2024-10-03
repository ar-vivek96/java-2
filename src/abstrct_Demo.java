//Abstrct class in java 
abstract class Shapew
{
	abstract void draw();
	void message()
	{
		System.out.println("message from Shape");
	}
}
class RectangleShapew extends Shapew
{
	void draw()      // override
	{
		System.out.println("Draw Rectangle using Shape length & Breadth");
	}
	
}

public class abstrct_Demo {

	public static void main(String[] args) {
		
		RectangleShapew o=new RectangleShapew();
		o.draw();
		o.message();
		
		
		

	}

}
