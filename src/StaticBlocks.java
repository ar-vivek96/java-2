//Static Blocks in java
class staticTest
{
	static
	{
		System.out.println("Blocktest -1");
	}
	static
	{
		System.out.println("Blocktest-2");
				 };
}
public class StaticBlocks {
	static {
		System.out.println("Block -1");
	}

	public static void main(String[] args) {
		
		staticTest o=new staticTest();
		System.out.println("Block-main");
	
		
	}
	static {
		System.out.println("Block -2");
	}

}
