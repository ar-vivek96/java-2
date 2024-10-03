
public class methodDemo {

	static int boxvolume(int length,int breadth,int height)//method definition(formal parameter)
	{
		return length*breadth*height;
		
	}
	static void printline()
	{
		System.out.println("---------------------");
	}
	
	
	public static void main(String[] args) {
	
		int vol=boxvolume(10,4,6);//method call-(actual parameter)
		System.out.println("Volume:"+vol);
		printline();
		System.out.println("Volume:"+boxvolume(1,2,3));
		
		

	}

}
