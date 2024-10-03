package dataStructrue;

public class DemoStack {

	public static void main(String[] args) {
		
		ArrayStack<String> stack=new ArrayStack<>();
		stack.push("Vivek");
		stack.push("Anbu");
		stack.push("Rani");
		System.out.println("poped "+stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		

	}

}
