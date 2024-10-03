//Static inner class
class OuterClass
{
	static int x=20;
	int y=28;
	static class InnerClass
	{
		void display()
		{
			System.out.println("X :"+x);
		}
	}
	
}







public class staticinnerclass {

	public static void main(String[] args) {
		OuterClass.InnerClass i=new OuterClass.InnerClass();
		i.display();
		
	}

}
