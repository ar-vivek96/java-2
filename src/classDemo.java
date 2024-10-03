class box
{
	int length;
	int height;
	int breadth;
	int volume()
	{
		return length*breadth*height;
	}
}
public class classDemo {

	public static void main(String[] args) {
		
		box blackBox=new box();
		blackBox.length=10;
		blackBox.breadth=90;
		blackBox.height=80;
		box woodBox=new box();
		woodBox.length=10;
		woodBox.height=30;
		woodBox.breadth=10;
		System.out.println(woodBox.height);
		System.out.println(blackBox.height);
		System.out.println("Volume:"+woodBox.volume());
		
		System.out.println("Volume:"+blackBox.volume());

	}

}
