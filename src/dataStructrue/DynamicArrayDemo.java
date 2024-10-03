package dataStructrue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class DynamicArray<T> implements Iterable  
{
	private static final int initialcapacity=3;
	private T arr[];
	private int size;
	private int capacity;
	DynamicArray()
	{
		size=0;
		arr=(T[])new Object[initialcapacity];
		capacity=initialcapacity;
	}
	
	public void add(T val)
	{
		if(size==capacity)
			expandArray();
		arr[size++]=val;
	}
	private void expandArray()
	{
		capacity=2*capacity;
		arr=Arrays.copyOf(arr, capacity);
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public void insertAtPos(int pos,T val)
	{
		if(size==capacity)
		{
			expandArray();
		}
		for(int i=size-1;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		size++;
	}
	private void shrinkArray()
	{
		capacity/=2;
		arr=Arrays.copyOf(arr, capacity);
	}
	public void deleteAtPos(int pos)
	{
		
		for(int i=pos+1;i<size;i++)
		{
			arr[i-1]=arr[i];
		}
		size--;
		if(capacity>initialcapacity&&capacity>size*3)
			shrinkArray();
	}
	public void deleteAtEnd()
	{
		for(int i=size-1+1;i<size;i++)
		{
			arr[i-1]=arr[i];
		}
		size--;
	}
	public void	deleteAtBeginning()
	{	int pos=0;
		for(int i=pos+1;i<size;i++)
		{
			arr[i-1]=arr[i];
		}
		size--;
	}
	public void insertAtBeginning(T val)
	{
		int pos=0;
		if(capacity==size)
			expandArray();
		for(int i=size-1;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		size++;
	}
	public T getIndex(int index)
	{
		return arr[index];
	}
	public void search(T val)
	{
		for(int i=0;i<size;i++)
		{
			if(val==arr[i])
			{
				System.out.println("index:"+i);
			}
		}
	}
	public boolean contains(T val)
	{
		for(int i=0;i<size;i++)
		{
			if(val==arr[i])
			{
				return true;
			}
				
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		
		return new Iterator<T>() {
			
			int index=0;
			@Override
			public boolean hasNext() {
				return index<size;
			}

			@Override
			public T next() {
				return arr[index++];
			}
		};
	}
		
		
}
public class DynamicArrayDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DynamicArray<String> list=new DynamicArray<>();
		
		String val;
		int pos;
		while(true) {
		System.out.println("\n-----------------List Menu-------------\n");
		System.out.println("1.Insert At End\n");
		System.out.println("2.Display the List \n");
		System.out.println("3.Insert At Specified Pos\n");
		System.out.println("4.Delete At Specified pos\n");
		System.out.println("5.Delte At End\n");
		System.out.println("6.Delete At beginning\n");
		System.out.println("7.Insert At beginning\n");
		System.out.println("8.get index\n");
		System.out.println("9.search value\n");
		System.out.println("10.contains\n");
		System.out.println("11.Exit");
		System.out.println("-----------------------------------------");
		System.out.println("Enter Your Chice:\t");
		
			int choice=in.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter Value to Insert:\n");
					val=in.next();
					list.add(val);
					break;
			case 2:list.display();
					for(Object x:list)
					{
						System.out.println(x);
					}
					break;
			case 3:System.out.println("Enter position to insert(starts from 0):\n");
					pos=in.nextInt();
					if(pos<0)
						System.out.println("Invalid pos");
					System.out.println("Enter val to insert:\n");
					val=in.next();
					list.insertAtPos(pos,val);
					break;
			case 4:System.out.println("Enter Position to delete:\n");
					pos=in.nextInt();
					if(pos<0)
						System.out.println("invalid pos\n");
					list.deleteAtPos(pos);
					break;
			case 5: list.deleteAtEnd();
					break;
			case 6:list.deleteAtBeginning();
					break;
			case 7:System.out.println("Enter value to insert\n");
					val=in.next();
					list.insertAtBeginning(val);
					break;
			case 8:System.out.println("Enter index to get value:\n");
					int index=in.nextInt();
					val=list.getIndex(index);
					System.out.println(val);
			case 9:System.out.println("enter values to search\n");
					val=in.next();
					list.search(val);
					break;
			case 10:System.out.println("Enter Val to check\n");
					val=in.next();
					boolean v=list.contains(val);
					System.out.println(v);
					break;
			case 11:System.exit(0);
					break;
			default:System.out.println("invalid Choice");
				break;
				
			}
		
		}
		

	}

}
