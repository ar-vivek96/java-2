
interface Animal
{
	void Sound();
	void Sleep();
}
class Dog implements Animal
{
	public void Sound()
	{
		System.out.println("The Dog Sounds Like A:Wolf");
	}
	public void Sleep()
	{
		System.out.println("The Dog Is Sleeping");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.Sound();
		d.Sleep();
	}

}
