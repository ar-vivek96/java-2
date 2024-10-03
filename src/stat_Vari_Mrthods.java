//Static variables and methods
class StaticTest
{
	static int a=10;
	int b=20;
	void show()
	{
		System.out.println("A :"+a + " B :"+b);
	}
static void display()
	{
	System.out.println("A :"+a);
	}
}

public class stat_Vari_Mrthods {

	public static void main(String[] args) {
		
		StaticTest o1=new StaticTest();
		o1.show();
		StaticTest o2=new StaticTest();
		o2.b=100;
		StaticTest.a=200;
		o2.show();
		o2.display();
	}

}
