//single inheritance
class Father                    // base class
{
	public void house()
	{
		System.out.println("Have OWn 2 Bhk house");
	}
	
}
class Son extends Father                  //derived 
{
	public void car()
	{
		System.out.println("Have own audi car");
	}
}
public class single {

	public static void main(String[] args) {
		
		Son o=new Son();
		o.car();                           //we can access both class using one object with help of inheritance 
		o.house();
		
	}

}
