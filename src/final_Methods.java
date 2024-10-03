class Super
{
	public void display()
	{
		System.out.println("i am supper Display");
	}
	final void finalDisplay()
	{
		System.out.println("i am supper final Display");
		
	}
}
class Sub extends Super
{
	public void display()
	{
		System.out.println("i am sub Display");
	}

}

public class final_Methods {

	public static void main(String[] args) {
		
		Sub o=new Sub();
		o.display();
		o.finalDisplay();

	}

}
