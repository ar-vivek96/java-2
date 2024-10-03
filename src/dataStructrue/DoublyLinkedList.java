package dataStructrue;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T>{
	
	Node head;
	Node tail;
	class Node
	{
		T data;
		Node next;
		Node prev;
		Node(T val)
		{
			data=val;
			next=null;
			prev=null;
		}
	}
	DoublyLinkedList()
	{
		head=null;
		tail=null;
	}
	
	public void insertAtBeginning( T val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void reverse()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		
	}
	public void insertAtpos(int pos,T val)
	{
		
		if(pos==0)
		{
			insertAtBeginning(val);
			return;
		}
		Node newNode=new Node(val);
		Node temp=head;
		
			for(int i=1;i<pos;i++)
			{
				temp=temp.next;
				if(temp==null)
				{
					throw new IndexOutOfBoundsException();
				}
			}
			newNode.next=temp.next;
			newNode.prev=temp;
			
			if(temp==tail) 
				tail=newNode;
			else 
			temp.next.prev=newNode;
			temp.next=newNode;
			
	}
	public void deleteAtPos(int pos)
	{
		Node temp=head;
		Node prev=null;
		if(pos==0)
		{
			head=head.next;
			if(head==null)
				tail=null;
			else
				head.prev=null;
			return;
		}
		for(int i=1;i<=pos;i++)
		{	
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		if(temp.next==null)
		{
			tail=prev;
		}
		else	
		temp.next.prev=prev;
	}
	public Iterator<T> iterator()
	{
		return new Iterator<T>() {
			
			Node temp=head;
			public boolean hasNext()
			{
				return temp!=null;
			}
			public T next()
			{
				T val=temp.data;
				temp=temp.next;
				return val;
			}
		};
	}
}
