package dataStructrue;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
	
	Node head;
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
		
		LinkedList()
		{
			head=null;
		}
	
	public void insertAtBeginning(T val)
	{
		Node newNode=new Node(val);
		
		if(head==null)
			head=newNode;
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void insertAtPosition(int pos,T val)
	{
		Node newNode=new Node(val);
		Node temp=head;
		if(pos==0)
		{
			insertAtBeginning(val);
		}
		else
		{
			for(int i=1;i<pos;i++) {
			temp=temp.next;
			try {
			if(temp==null)
			{
				throw new IndexOutOfBoundsException();
			}
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
			newNode.next=temp.next;
			temp.next=newNode;	
		}
	}
	public void deleteAtPos(int pos)
	{
		Node temp=head;
		Node prev=null;
		if(head==null) {
			throw new IndexOutOfBoundsException("list is empty");
		}
		if(pos==0)
		{
			head=head.next;
			return;
		}
		
		for(int i=1;i<=pos;i++)
		{	prev=temp;
			temp=temp.next;
		}
			
			prev.next=temp.next;
	}
	public void getIndex(int index)
	{
		Node temp=head;
		if(index==0) {
			System.out.println("index val:"+temp.data);
		}
		else {
			
		for(int i=1;i<=index;i++)
		{
			temp=temp.next;
		}
		System.out.println("Index Val:"+temp.data);
		}
	}
	public void update(int index,T val)
	{
		Node temp=head;
		if(index==0)
		{
			head.data=val;
		}
		
		for(int i=1;i<=index;i++)
		{
			temp=temp.next;
		}
		temp.data=val;
	}
	public void deleteAtEnd()
	{
		Node temp =head;
		Node prev=null;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
	}
	public void insertAtEnd(T val)
	{
		Node newNode=new Node(val);
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		
	}
	public int  search(T val)
	{
		Node temp=head;
		int index=0;
		while(temp!=null)
		{
			temp=temp.next;
			index++;
			if(val==temp.data)
				return index;
				break;
		}
		return -1;
	}
	public boolean contains(T val)
	{
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			if(val==temp.data)
				return true;
				break;
		}
		
		return false;
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

	@Override
	public Iterator<T> iterator() {
	
		return new Iterator<T>(){
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
			
		} ;
	}	
	
	public void reverse()
	{
		Node prev=null;
		Node current=head;
		Node next=head.next;
		
		while(current !=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
}
