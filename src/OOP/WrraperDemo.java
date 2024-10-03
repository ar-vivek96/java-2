package OOP;

public class WrraperDemo {

	public static void main(String[] args) {
	
		int i=10;//primitive value
		float a;
		Integer i2=Integer.valueOf(i);//Boxing,wrapping
		int j=i2.intValue();//Unboxing
		Integer i3=20;//Integer .valueOf(20)-auto Boxing
		int k=i2;//AutoUnboxing
		String s="123";
		int i4=Integer.parseInt(s);
		System.out.println(i4);
	}

}
