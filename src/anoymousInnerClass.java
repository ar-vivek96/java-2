abstract class testDemo
{
	abstract void display();

}
class outerDemo
{
	public void outerDisplay()
	{
		testDemo o=new testDemo() {

			@Override
			void display() {							//anonymous innerclass
				System.out.println("TEst Display");
				
			}
			
		};
		o.display();
	}
}
public class anoymousInnerClass {

	public static void main(String[] args) {
		
		outerDemo  n=new outerDemo();
		n.outerDisplay();
	}

}
