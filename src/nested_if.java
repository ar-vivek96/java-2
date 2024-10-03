import java.util.*;

/*A Company insures its drivers in the following cases:
 * a. if the Driver is married.
 * b. if the driver is unmarried,male& Above 30 years of age
 * c. if the driver is unmarried,female &above 25 years of age
 */
public class nested_if {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Marital Status M/U:");
		char marital=in.next().charAt(0);
		if(marital=='u'||marital=='U')
		{
			System.out.println("Enter your Gender M/F:");
			char gender=in.next().charAt(0);
			System.out.println("Enter your age:");
			int age=in.nextInt();
			if((gender=='M'||gender=='m')&&age>=30)
			{
				System.out.println("Your are eligible for Insurance");
			}
			else if(gender=='f'||gender=='F'&&age>=25)
			{
				System.out.println("Your are eligible for Insurance");
			}
			else
			{
				System.out.println("Your are not eligible for Insurance");
			}
		}
		else if(marital=='m'||marital=='M')
		{
			System.out.println("Your Eligible for insurance");
		}
		else
		{
			System.out.println("Invalid input");
		}
		

	}

}
