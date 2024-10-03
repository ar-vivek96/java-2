package OOP;
//Inner classes or nested classes
class Outer
{
	int num;
	void outerDisplay()
	{
		System.out.println("Outer Display");
	}
  static class Inner
{
	int x;
	void innerDisplay()
	{
		System.out.println("Inner Display");
	}
}
}
public class InnerDemo {

	public static void main(String[] args) {
		
		Outer o=new Outer();
		o.num=10;
		o.outerDisplay();
	     Outer.Inner i=new Outer.Inner();
		i.innerDisplay();
		
		
	}

}
