package dataStructrue;

import dataStructrue.StackUsingLinkedList.Node;

public class DemoStackLinked {

	public static void main(String[] args) {
		
		StackUsingLinkedList <String> s=new StackUsingLinkedList<>();
		s.push("Vivek");
		s.push("Rani");
		s.push("Anbu");
		System.out.println("Poped "+s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}

}
