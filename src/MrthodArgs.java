  

//Method with varargs in java        -variable arguments
public class MrthodArgs {
	public static void getNames(String... name)
	{
		for(String names:name)
		{
			System.out.println(names);
		}
	}

	public static void main(String[] args) {
		
		getNames("vivek","naveen","sisin","surya");
	}

}
