
public class String_Concept {

	public static void main(String[] args) {

		String a="vivek";
		String b="Vivek";
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("A HashCode:"+a.hashCode());
		System.out.println("b HashCode:"+b.hashCode());
		System.out.println("Equals:"+a.equals(b));
		System.out.println("Equals ignore Case:"+a.equalsIgnoreCase(b));
		System.out.println("LEngth:"+a.length());
		System.out.println("CharAt:"+a.charAt(0));
		System.out.println("UpperCase:"+a.toUpperCase());
		System.out.println("lowerCase:"+a.toLowerCase());
		System.out.println("REplace:"+a.replace("vek","anu"));
		System.out.println("Contains:"+a.contains("viv"));
		System.out.println("Empty"+a.isEmpty());
		System.out.println("endsWith:"+a.endsWith("ek"));
		System.out.println("stratWith:"+a.startsWith("vi"));
		System.out.println("Substring:"+a.substring(3));
		System.out.println("Substring:"+a.substring(0,1));
		char c[]=a.toCharArray();
		for(char v:c)
		{
			System.out.print(v+" ");
		}
		String d=" tutor ";
		System.out.println("length:"+d.length());
		System.out.println("D"+d);
		System.out.println("D trim  "+d.trim());
		System.out.println("D trim  "+d.trim().length());
		
		
		
		
		
		
	}
	}
	
	


