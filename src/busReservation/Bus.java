package busReservation;

public class Bus {

	private int busno;
    private	boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap) //constructor
	{
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
		
	}
	public int getcapacity()//accessor method
	{
	return capacity;
	}
	public void setcapacity(int cap)//mutator 
	{
		capacity=cap;
	}
	public int getBusno()//accessor
	{
		return busno;
	}
	public void setBusno(int no)//mutator
	{
		no=busno;
	}
	public boolean isAc()
	{
		return ac;
	}
	public void setAc(boolean val)
	{
		ac=val;
	}
	public void displayBusinfo()
	{
		System.out.println("Bus NO: "+busno+ " Ac: "+ ac +" Capacity: "+capacity);
	}
	
	}


