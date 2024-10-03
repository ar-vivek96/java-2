
class RectangleShape
{
	private int length,width;
	int getLength()
	{
		return length;
	}
	int getWidth()
	{
		return width;
	}
	void setLength(int l)
	{
		if(l>0)
		length=l;
		
		else
			length= 0;
			
	}
	void setWidth(int w)
	{
		if(w>0)
		width=w;
		
		else
			width=0;
	}
	int area()
	{
		int a=length*width;
		return a;
	}
}

public class get_sett {

	public static void main(String[] args) {
		
		RectangleShape o=new RectangleShape();
		o.setWidth(10);
		o.setLength(20);
		System.out.println("Area of Rectangle "+o.area());
		System.out.println(o.getLength());
		System.out.println(o.getWidth());
		
		
		
	}

}
