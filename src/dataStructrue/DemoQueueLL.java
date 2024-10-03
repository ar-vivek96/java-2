package dataStructrue;

public class DemoQueueLL {

	public static void main(String[] args) {
		QueueLL q=new QueueLL();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(4);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
	//	System.out.println(q.elementAtfront());
		

	}

}
