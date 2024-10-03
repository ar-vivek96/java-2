package dataStructrue;

public class DemoArray2 {

	public static void main(String[] args) {
		
		QueueUsingArray q=new QueueUsingArray();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		

	

	}

}
