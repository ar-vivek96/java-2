//nesting of methods
class Demo
{
	private int m,n;
	Demo(int x,int y)
	{
		m=x;
		n=y;
	}
	int largest()
	{
		if(m>n)
			return m;
		
		else
			return n;
	}
	void display()
	{
		int largest =largest();         // nesting of metods
		System.out.println("LArgest Number "+largest);
	}
	
	
}
public class nested_method {

	public static void main(String[] args) {
		
		Demo a=new Demo(10,20);
		a.display();
	}

}
