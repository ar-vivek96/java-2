//Abstract example program
abstract class mobile
{
	void voicecall()
	{
		System.out.println("You Can Make a Call");
	}
		abstract void touchDisply();
		abstract void camera();
	
}
class Samsung extends mobile
{
	void camera()
	{
		System.out.println("64 Mega pixel Camera");
	}
	void touchDisplay()
	{
		System.out.println("5.9 inch Touch Display");
	}
}
class Nokia extends mobile
{
	void camera()
	{
		System.out.println("64 Mega pixel Camera");
	}
	void touchDisplay()
	{
		System.out.println("6.1 inch Touch Display");
	}
	void fingerprint()
	{
		System.out.println("We provide Finger Print Sensor");
	}
}

public class abstractDemo2 {

	public static void main(String[] args) {
		
		Samsung m32=new Samsung();
		m32.camera();
		m32.touchDisplay();
		System.out.println("-----------------------------------------");
		 
		Nokia n1=new Nokia();
		n1.camera();
		n1.touchDisplay();
		n1.fingerprint();

	}

}
