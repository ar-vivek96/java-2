//final class in java
final class finalClassDemo
{
	void display()
	{
		System.out.println("i am Display");                 //if classes have final before class it cannot make inheritance of class 
	}
}
public class final_Class {

	public static void main(String[] args) {
		
		finalClassDemo o=new finalClassDemo();
		o.display();
	}

}
