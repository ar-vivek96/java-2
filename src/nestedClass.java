//Nested inner class
class Outer
{
	int a=50;
	class inner
	{
		int b=20;
		void innerDisplay()
		{
			System.out.println("Outer A :"+a);
			System.out.println("inner b :"+b);
		}
	}
	void outerDisplay()
	{
		inner i=new inner();
		i.innerDisplay();
		System.out.println("B From inner class by outer Display : "+i.b);
	}
}
public class nestedClass {

	public static void main(String[] args) {
		
		Outer o=new Outer();
		o.outerDisplay();
		Outer.inner c=new Outer().new inner();
		c.innerDisplay();
		

	}

}
