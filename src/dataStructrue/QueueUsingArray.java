package dataStructrue;

public class QueueUsingArray {

	int rear;
	int arr[];
	static final int  MAX_SIZE=30;
	QueueUsingArray()
	{
		
		arr=new int[MAX_SIZE];
		rear=-1;
	}
	public void enqueue(int val)
	{
		if(rear==MAX_SIZE-1)
		{
			throw new IndexOutOfBoundsException("Queue is Empty");
		}
		arr[++rear]=val;
	}
	
	public int dequeue()
	{
		if(rear==-1)
		{
			throw new IndexOutOfBoundsException("Queue is Empty");
		}
		int temp=arr[0];
		for(int i=1;i<=rear;i++)
		{
			arr[i-1]=arr[i];
		}
		return temp;
	}
}
