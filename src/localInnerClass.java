//local inner class
class Outercls
{
	void display()
	{
		class inner        //local class
		{
			void innerDisplay()
			{
				System.out.println("Inner Display");
			}
		}
		inner o=new inner();
		o.innerDisplay();
	}
}


public class localInnerClass {

	public static void main(String[] args) {

		Outercls i=new Outercls();
		i.display();
		

	}

}
