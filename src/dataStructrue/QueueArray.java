package dataStructrue;

public class QueueArray {
	
	int front,rear;
	int arr[];
	
	static final int MAX_SIZE=30;
	
	QueueArray()
	{
		 arr=new int[MAX_SIZE];
		front=-1;
		rear=-1;
	}
	
	public void enqueue(int val)
	{
		if(rear==MAX_SIZE-1)
		{
			throw new IndexOutOfBoundsException("stack is full");
		}
		if(front==-1)
			front++;
		
		arr[++rear]=val;
		
	}
	public int dequeue()
	{
		try {
		if(front==-1||front>rear)
			throw new IndexOutOfBoundsException("Queue is Empty");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return arr[front++];
	}
	

}
