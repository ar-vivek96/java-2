package OOP;
import java.lang.reflect.*;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		Employee e=new Employee("Divya",60000);
		Class cls=e.getClass();
		System.out.println("Class name is"+cls.getName());
		Method[] methods=cls.getMethods();
		for(Method m:methods)
		{
			System.out.println(m.getName());
		}
		try {
			methods[0].invoke(e,null);
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
