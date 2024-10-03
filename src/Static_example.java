
class Mathematical
{
	public static int power(int base ,int power)
	{
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result=result*base;
		}
		return result;
	}
}






public class Static_example {
	// Static member function in java
	public static void main(String[] args) {
		
		System.out.println("power: "+Mathematical.power(2,3));
	}

}
