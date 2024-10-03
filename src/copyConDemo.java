//Copy Constructor
class Complex
{
	private int real,img;
	public Complex()
	{
		this.real=2;
		this.img=5;
	}
	public Complex(int r,int i)
	{
		real=r;
		img=i;
	}
	public Complex(Complex o2) ///copy constructor
	{
		this.real=o2.real;    //this -use current class
		this.img=o2.img;
	}
	 public String toString()
	{
		return"("+real+"+"+img+"i)";
	}
}
public class copyConDemo {

	public static void main(String[] args) {
		Complex o1=new Complex();
		System.out.println("Object 1 "+o1);
		Complex o2=new Complex(3,2);
		System.out.println("Object 2 "+o2);
		Complex o3=new Complex(o2);
		System.out.println("Object 2 "+o3);
		

	}

}
