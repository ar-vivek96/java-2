
public class enumDemo {
	enum Gamelevel
	{
		LOW,
		MEDIUM,
		HIGH,
	}
	
	public static void main(String[] args) {
		//Assign Enum variable
		Gamelevel a=Gamelevel.HIGH;
		System.out.println(a);
		//Enum using Switch case
		
		switch(a)
		{
		case LOW:
			System.out.println("LOW");
			break;
		case HIGH:
			System.out.println("HIGH");
			break;
		case MEDIUM:
			System.out.println("MEDIUM");
			break;
		
		}

		//Enum using for loop
			for(Gamelevel level :Gamelevel.values())
			{
				System.out.println(level);
			}
		
		
	}

}
