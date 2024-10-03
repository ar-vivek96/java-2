package dataStructrue;

public class DemoQueueArray {

	public static void main(String[] args) {
		
		QueueArray q=new QueueArray();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
