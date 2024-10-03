//final Variables in java
class Test
{
	final int MIN=1;
	final int MAX ;
	final int NORMAL;
	Test(int normal)
	{
		NORMAL=normal;
		MAX=100;
	}
	void display()
	{
		System.out.println("MIN :"+MIN);
		System.out.println("NORMAL :"+NORMAL);
		System.out.println("MAX :"+MAX);
		
	}
}
public class finalTest {

	public static void main(String[] args) {
		
		Test o=new Test(50);
		o.display();
		

	}

}
