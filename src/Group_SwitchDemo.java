import java.util.Scanner;

public class Group_SwitchDemo {

	public static void main(String[] args) {
		
		char c;
		System.out.println("Enter The Character :");
		Scanner in=new Scanner(System.in);
		c=in.next().charAt(0);
		switch(c)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c+" Is a vowel:");
			break;
		default:
			System.out.println(c+" Is a Consonant");
			break;
		
		}
		
	}

}
