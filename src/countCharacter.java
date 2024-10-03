
public class countCharacter {
//program to count upper,lower,vowels,space,number,and symbols in a string
	public static void main(String[] args) {
	
		StringBuilder a=new StringBuilder("Ram-age is 12@");
		System.out.println(a);
		int upper=0,lower=0,space=0,number=0,vowels=0,i;
		for(i=0;i<a.length();i++)
		{
			if(a.charAt(i)>=65&&a.charAt(i)<=90)
			{
				upper++;
			}
			if(a.charAt(i)>=97&&a.charAt(i)<=122)
			{
				lower++;
			}
			if(a.charAt(i)>=48&&a.charAt(i)<=57)
			{
				number++;
			}
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||
					a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U') {
			
				vowels++;
			}
			if(a.charAt(i)==32)
			{
				space++;
			}
		}
		System.out.println("Upper:"+upper);
		System.out.println("Lower:"+lower);
		System.out.println("vowels:"+vowels);
		System.out.println("space:"+space);
		System.out.println("Symbols:"+(a.length()-(upper+lower+space+number)));
		System.out.println("number:"+number);
		

	}

}
