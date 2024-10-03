//singleton class in java    -does not allow to make multiple objects
class ABC
{
	static ABC obj=null;
	private ABC(){}//Default constructor
	public static ABC getInstance()
	{
		if(obj==null)
			obj=new ABC();
		
		return obj;
	}
	void display()
	{
		System.out.println("i am Display");
	}
}
public class singleton {

	public static void main(String[] args) {
		ABC o=ABC.getInstance();
		o.display();
		
		

	}

}
