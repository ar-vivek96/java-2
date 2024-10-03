package OOP;

public class Stack {
	
	 int s[]=new int[10];
	int tos;//tos-top of Stack
	Stack()
	{
		tos=-1;
	}
	void push(int item)
	{
		
		if(tos==9)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			/*tos++;
			s[tos]=item;*/
			s[++tos]=item;
		}
	}
		int pop()
		{
			if(tos>=0)
			return s[tos--];
			else
			{
				System.out.println("Stack is empty");
			return -1;
			}
		}
		
	}
	



