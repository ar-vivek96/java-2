package dataStructrue;

public class QueueLL {
	Node front,rear;
	class Node{
		int data;
		Node next;
		Node(int val)
		{
			data=val;
			next=null;
		}
	}
	QueueLL()
	{
		front=null;
		rear=null;
	}
	public void enqueue(int val)
	{
		Node newNode=new Node(val);
		
		if(front==null)
			front=newNode;
		else
			rear.next=newNode;
			rear=newNode;
		
	}
	public int dequeue()
	{
		if(front==null)
		{
			throw new IndexOutOfBoundsException("Queue is Empty");
		}
		
		int temp=front.data;
		front=front.next;
		if(front==null)
			rear=null;
		return temp;
	}
	public boolean isEmpty()
	{
		return (front==null);
	}
	public int elementAtfront()
	{
		if(front==null)
			throw new IndexOutOfBoundsException();
		
		return front.data;
	}

}
