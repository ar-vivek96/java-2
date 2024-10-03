
public class upperCase {

	public static void main(String[] args) {
		
		StringBuilder a=new StringBuilder("java is an object oriented");
		System.out.println("Original:"+a);
		int i;
		for(i=0;i<a.length();i++)
		{
			if(a.charAt(i)>=97&&a.charAt(i)<=122)
			{
				int c=(int)(a.charAt(i)-32);
				a.setCharAt(i,(char)c);
			}
		}
		System.out.println("Uppercase:"+a);

	}

}
