
public class Lowercase {

	public static void main(String[] args) {

		StringBuilder a=new StringBuilder("JAVA IS AN OBJECT ORIENTED");
		System.out.println("Orginal:"+a);
		int i;
		for(i=0;i<a.length();i++)
		{
			if(a.charAt(i)>=65&&a.charAt(i)<=90)
			{
				int c=(int)(a.charAt(i)+32);
					a.setCharAt(i,(char)c);	
			}
		}
		System.out.println("lower:"+a);

	}

}
