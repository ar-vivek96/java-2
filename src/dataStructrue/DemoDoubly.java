package dataStructrue;

public class DemoDoubly {

	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> list=new DoublyLinkedList<>();
		list.insertAtBeginning(1);
		list.insertAtBeginning(9);
		list.insertAtBeginning(10);
		list.display();
		System.out.println();
		list.reverse();
		System.out.println("");
		list.insertAtpos(3, 2);
		list.display();
		System.out.println();
		list.reverse();
		System.out.println();
		list.deleteAtPos(3);
		list.display();
		System.out.println();
		list.reverse();
		System.out.println();
		for(int x:list)
		{
			System.out.print(" "+x);
		}
	}
	

}
