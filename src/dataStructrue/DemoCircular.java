package dataStructrue;

public class DemoCircular {

	public static void main(String[] args) {
		CircularLinkedList<String> list=new CircularLinkedList<>();
		list.insertAtBeginning("Vivek");
		list.insertAtBeginning("Anbu");
		list.insertAtBeginning("rani");
		list.display();
		System.out.println();
		list.insertAtEnd("krishi");
		list.display();
		System.out.println();
		list.deleteAtBeginning();
		list.display();
		System.out.println();
		list.deleteAtEnd();
		list.display();
		

	}

}
