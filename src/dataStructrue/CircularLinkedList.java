package dataStructrue;

public class CircularLinkedList<T> {
	
	Node last;
	
	class Node
	{
		T data;
		Node next;
		
		Node(T val)
		{
			data=val;
			next=null;
		}
	}
	CircularLinkedList()
	{
		last=null;
	}
	
	public void insertAtBeginning(T val)
	{
		Node newNode=new Node(val);
		if(last==null) {
			last=newNode;
			newNode.next=newNode;
		}
			else {
				newNode.next=last.next;
			    last.next=newNode;
			}
	}
	
	public void insertAtEnd(T val)
	{
		Node newNode=new Node(val);
		if(last==null)
			{last=newNode;
		newNode.next=newNode;}
		else {
			newNode.next=last.next;
			last.next=newNode;
		}
		last=newNode;
		
	}
	public void display()
	{
		Node temp=last.next;
		
		do
		{	System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);
	}
	
	public void deleteAtBeginning()
	{
		if(last==null)
		{
			throw new IndexOutOfBoundsException();
		}
		if(last.next==last)
			last=null;
		else
			last.next=last.next.next;
			
	}
	public void deleteAtEnd()
	{
		if(last==null)
		{
			throw new IndexOutOfBoundsException();
		}
		if(last.next==last)
		{
			last=null;
		}
		else
		{
			Node temp=last.next;
			while(temp.next!=last)
			{
				temp=temp.next;
			}
			temp.next=last.next.next;
			last=temp;
			
		}
	}
	
}
