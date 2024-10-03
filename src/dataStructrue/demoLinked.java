package dataStructrue;

import java.util.Iterator;

public class demoLinked {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.insertAtBeginning(9);
		list.insertAtBeginning(5);
		list.insertAtBeginning(1);
		list.insertAtPosition(3, 10);
		list.display();  
		System.out.println("");
		list.deleteAtPos(0);
		list.display();
		list.getIndex(1);
		System.out.println("");
		list.update(1, 2);
		list.display();
		System.out.println("");
		list.deleteAtEnd();
		list.display();
		System.out.println(" ");
		list.insertAtEnd(1);
		list.display();
		System.out.println("");
		System.out.println(list.search(1));
		System.out.println(list.contains(3));
		System.out.println(" ");
		
		for(int X:list)
		{
			System.out.print(" "+X);
		}
		
		Iterator <Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		list.reverse();
		list.display();
	}

}
