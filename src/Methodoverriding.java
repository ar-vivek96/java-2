class User
{
	String name;
	int age;
	User(String n,int a)
	{
		name=n;
		age=a;
	}
	public void display()
	{
		System.out.println("Name "+name);
		System.out.println("age "+age);
		
	}
}
class Mainprogrammer extends User
{
	String companyname;
	Mainprogrammer(String n,int a,String c)
	{
		super(n,a);
		this.companyname=c;
		
	}
	public void display()
	{
		System.out.println("Name "+name);                          // method overriding 
		System.out.println("age "+age);
		System.out.println("Company name: "+companyname);       //redefine the methods of base class is known as method overriding
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		
		Mainprogrammer a=new Mainprogrammer("vivek",26,"zoho");
		a.display();

	}

}
