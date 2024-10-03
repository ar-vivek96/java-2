import java.util.Scanner;
import java.math.*;

public class Amstrong_number {

	public static void main(String[] args) {

		System.out.println("Enter 3 digit number: ");
		Scanner in =new Scanner(System.in);
		int number=in.nextInt();
		int temp=number;
		int result=0,d=0;
		while(number>0)
		{
			d++;
		}
		System.out.println(d);
		while(number!=0)
		{
			result= result+(int)Math.pow((number%10),d);//153%10-3(15%10)-5-(1%10-1)
			number=number/10;//153-15-1
			
		}	
		System.out.println(result);
		
		
		if(result==temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not An ArmStrong  number");
			
		}

	}

	

}
