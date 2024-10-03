
interface interDemo
{
	int a =12;
	void fun1();
	void fun2();
	public static void fun3()
	{
		System.out.println("i Am Fun 3");
	}
	default void fun5()
	{
		System.out.println("Fun-5");
	}

}
interface interDemo2 extends interDemo
{
	void fun4();
}
class Testinter implements interDemo2
{

	@Override
	public void fun1() {
		System.out.println("Fun-1");
	}

	@Override
	public void fun2() {
		System.out.println("Fun-2");
		
	}

	@Override
	public void fun4() {
		System.out.println("Fun-4");
		
	}
	
}
public class interfaceModeDemo {

	public static void main(String[] args) {
		System.out.println(interDemo.a);
		interDemo.fun3();

	}

}
