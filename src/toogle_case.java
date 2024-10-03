
public class toogle_case {

	public static void main(String[] args) {
		
		StringBuilder a=new StringBuilder("Java Is An Object Oriented");
		System.out.println("Original String:"+a);
		int i;
		for(i=0;i<a.length();i++) {
			
			if(a.charAt(i)>=97&&a.charAt(i)<=122)
			{
				int b=(int)(a.charAt(i)-32);
				a.setCharAt(i,(char) b);
			}
			else if(a.charAt(i)>=65&&a.charAt(i)<=90)
			{
				int c=(int)(a.charAt(i)+32);
						a.setCharAt(i,(char) c);
			}
		}
		
		System.out.println("Toogle CAse String:"+a);

	}

}
