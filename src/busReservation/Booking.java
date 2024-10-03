package busReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengername;
	int busNo;
	Date date;
	Booking()
	{
		Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter Passenger Name:");
	  passengername=scanner.next();
	  System.out.println("Enter Bus NO:");
	  busNo=scanner.nextInt();
	  System.out.println("Enter date DD-MM-YYYY:");
	  String dateInput=scanner.next();	
	  SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	 try {
		date= dateFormat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
	 public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus>buses1) {
		 
		 int capacity=0;
		 
				 for(Bus bus:buses1)
				 {
					 if(bus.getBusno()==busNo)
					 {
						 capacity=bus.getcapacity();
					 }
				 }
				 int booked=0;
				 for(Booking b:bookings)
				 {
					 if(b.busNo==busNo&&b.date.equals(date))
					 {
						booked++; 
					 }
				 }
	 return booked<capacity?true:false;
	   
	}
	
}


