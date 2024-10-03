package dataStructrue;

public class StackUsingLinkedList<T> {
	Node top;
	class Node
	{
		Node next;
		T data;
		
		
		Node(T val)
		{
			data=val;
			next=null;
		}
	}
	StackUsingLinkedList()
	{
		top=null;
	}
	public void push(T val)
	{
		Node newNode=new Node(val);
		
		newNode.next=top;
		top=newNode;
	
	}
	public T pop()
	{
		if(top==null)
		{
			throw new IndexOutOfBoundsException("Stack is Empty");
		}
		T val=top.data;
		top=top.next;
		return  val;
	}
	public T peek()
	{
		return top.data;
	}
	
	public boolean isEmpty()
	{
		return (top==null);
	}
	
}
