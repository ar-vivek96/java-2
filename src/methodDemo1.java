
class Box1
{
	int length;
	int breadth;
	int height;
  static int boxCount;
	Box1(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
		boxCount++;
	}
	Box1()
	{
		length=-1;
		breadth=-1;
		height=-1;
		boxCount++;
	}
	static {
		System.out.println("From the Static Block");
		boxCount=0;
		
	}
	Box1(int l)
	{
		length=height=breadth=l;
		boxCount++;
	}
	Box1(Box1 b)//copy constructor 
	{
	  b.length=length;
	  b.breadth=breadth;
	  b.height=height;
	  boxCount++;
	}
	void setDim(int l,int b,int h)//this pointer
	{
		this.length =l;
		this.breadth=b;
		this.height=h;
	}
	int volume()
	{
		return length*breadth*height;
	}
	boolean isEqual(Box1 b)
	{
		if(length==b.length&&breadth==b.breadth&&height==b.height)
		return true;
		
		return false;
		
	}
	static void displayBoxcount()
	{
		System.out.println("Boxcount"+Box1.boxCount);
	}

}

public class methodDemo1 {

	public static void main(String args[])
	{
		System.out.println("Main Starts Here");
		System.out.println("Before Creating Box object");
		Box1 blackBox=new Box1(1,2,3);
		System.out.println("After Creating Box object");
		blackBox.setDim(1,2,3);
		System.out.println("Volume:"+blackBox.volume());
		Box1 b1=new Box1(1,2,3);
		System.out.println("Black Box ==b1"+blackBox.isEqual(b1));
		blackBox.isEqual(b1);
		Box1 b2=new Box1(b1);
		System.out.println("Boxcount"+Box1.boxCount);
		Box1.displayBoxcount();
		
	
		
	}

}