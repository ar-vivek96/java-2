import java.util.*;

//Leapyear
public class if_else_statement {

	public static void main(String[] args) {
		
		int year;
		System.out.println("Enter Year:");
		Scanner in=new Scanner(System.in);
		year=in.nextInt();
		if(year %4 ==0 || (year % 100==0 && year%400==0))
				{
					System.out.println("year "+year+" is a leap Year");
				}
		else
		{
			System.out.println("year "+year+" is a Not A LeapYear");
		
		}

	}

}
