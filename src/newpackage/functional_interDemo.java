package newpackage;
@FunctionalInterface
interface MyInterface
{
	void display(int i);
}
/*class face implements MyInterface
{

	@Override
	public void display() {
		System.out.println("in Display");
		
	}
	
}*/
			
public class functional_interDemo {

	public static void main(String[] args) {
		
		MyInterface f=(i)->System.out.println("In display"+i);										//lambda expression
			
				
		f.display(5);

	}

}
