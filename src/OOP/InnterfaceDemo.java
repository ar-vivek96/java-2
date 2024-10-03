package OOP;
interface Ridable
{
	 void ride();
	
}
class Car implements Ridable
{
	public void ride()
	{
		System.out.println("You are riding a car");
	}
}
	class Bike implements Ridable
	{
		public void ride()
		{
			System.out.println("You are riding a Bike");
		}
	}
	class Mechanic
	{
		void Check(Ridable r)
		{
			System.out.println("Checking");
			r.ride();
		}
	}

public class InnterfaceDemo {

	public static void main(String[] args) {
		Mechanic m=new Mechanic();
		Car c=new Car();
		Bike b=new Bike();
		
		m.Check(c);
		m.Check(b);
		
		
	
		

	}

}
