package busReservation;
import java.util.*;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		
		Bus buses[]=new Bus[50];
		ArrayList<Bus> buses1=new ArrayList<Bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		buses1.add(new Bus(1,true,2));
		buses1.add(new Bus(2,false,50));
		buses1.add(new Bus(3,true,48));
		Scanner scanner=new Scanner(System.in);
		int useropt=1;
		for(Bus b:buses1)
		{
			b.displayBusinfo();
		}
		while(useropt==1)
		{
		System.out.println("Enter 1 to Book and 2 to Exit");
		useropt=scanner.nextInt();
		if (useropt==1)
		{
		  Booking booking=new Booking();
		  if(booking.isAvailable(bookings,buses1))
		  {
			  bookings.add(booking);
			  System.out.println("Your Booking is Conformed");
		  }
		  else
		  {
			  System.out.println("Soory Bus is full try another Bus or date."); 
		  }
		  
		}
		

	}

}
}