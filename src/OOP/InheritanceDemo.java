package OOP;
class Employee//(base class,super class,parent class,
{
	 protected String name;
	 private double salary;
	
	Employee(String n,double s)
	{
		salary=s;
		name=n;
	}
	 double getSalary()
	{
		return salary;
	}
	 void setSalary(double sal)
	 {
		 salary=sal;
	 }
	 String getname()
	 {
		 return name;
	 }
	 void setaname(String n)
	 {
		 name=n;
	 }
	void raiseSalary(double percent)
	 {
		 salary=salary+salary*percent/100;
	 }
	Employee()
	{
		name=" ";
		salary=0.0;
	}
}

class Manager extends Employee//(Derived class,sub class,child class
{
	double bonus;
	
	Manager(String n,double s,double b)
	{
		super(n,s);
		name=n;
		bonus=b;
	}
	void setBonus(double b)
	{
		bonus=b;
	}
	public double getSalary()//over riding 
	{
		return super.getSalary()+bonus;
	}
	
}
	 


public class InheritanceDemo {

	public static void main(String[] args) {
		Employee e1=new Employee("Ram",35000);
		e1.raiseSalary(10);
		System.out.println(e1.getSalary());
		Manager m1=new Manager("vivek",65000.0,0.0);
	
		m1.setBonus(20000);
		System.out.println(m1.getSalary());
		Employee e2=new Manager("Raa",30000,0);
		int[] arr=new int[50];
		Employee[] employee=new Employee[4];
		employee[0]=new Employee("Ram",90000);
		employee[1]=new Employee("Viv",92000);
		employee[2]=new Employee("Asa",93000);
		employee[3]=m1;
		employee[2].setSalary(9000);
		for(Employee e:employee)
		{
			System.out.println(e.getname()+" "+e.getSalary());
		}
		
	
		
		
	}
	

}
