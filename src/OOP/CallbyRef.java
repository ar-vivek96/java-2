package OOP;
class Box2
{
	int length;
	int height;
	int breadth;

 Box2(int l,int b,int h)
 {
	length=l;
	breadth=b;
	height=h;
 }
 boolean isEqual(Box2 b)
 {
	 b.length++;
	 if(length==b.length && breadth==b.breadth && height==b.height)
		 return true;
	 
	 return false;
 }
Box2 doubleBox()
 {
	 Box2 temp=new Box2(2*length,2*breadth,2*height);
	 return temp;
	 
 }
 
 		
}
public class CallbyRef {

	public static void main(String[] args) {
       
		Box2 b1=new Box2(5,6,7);
		System.out.println(b1.length);
		Box2 b2=new Box2(5,6,7);
		System.out.println(b1.isEqual(b2));
		System.out.println(b2.length);//call by reference
		Box2 b3=b1.doubleBox();
		System.out.println(b3.length);
		System.out.println(b3.breadth);
		System.out.println(b3.height);//returning object


	}

}
