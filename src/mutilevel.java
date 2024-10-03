//multilevel inheritance
class Grandfather
{
	public void house()
	{
		System.out.println("Have OWn 2 Bhk house");
	}
}

class Fat extends Grandfather
{

	public void Land()
	{
		System.out.println("Have 5 acres of Land");
	}
}
class S extends Fat
{
	public void car()
	{
		System.out.println("Have OWn audi car");
	}
}




public class mutilevel {

	public static void main(String[] args) {
	 
		S o=new S();
		o.house();
		o.Land();
		o.car();


	}

}
