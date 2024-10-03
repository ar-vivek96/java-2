//Array of objects in java
class Student
{
	String name;
	int rollno;
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+rollno);
		System.out.println("-----------------------------------------");
		
	}
}
public class array_objects {

	public static void main(String[] args) {
		Student o[]=new Student[5];
		o[0]=new Student("ram",20);
		o[1]=new Student("Vivek",23);
		o[2]=new Student("vijay",46);
		o[3]=new Student("dhanush",50);
		o[4]=new Student("Surya",34);
		for(int i=0;i<o.length;i++)
		{
		o[i].print();
		}



	}

}
