
public class stringBuffer_stringBuilder {

	public static void main(String[] args) {

       StringBuffer buffer=new StringBuffer("Vivek");  //string buffer &string builder
       System.out.println(buffer);
       buffer.append(" anbu");
       System.out.println(buffer);
       buffer.insert(10," computer");
       System.out.println(buffer);
       buffer.replace(5,7,"&&&");
       System.out.println(buffer);
       buffer.delete(5, 7);
       System.out.println(buffer);
       buffer.reverse();
       System.out.println(buffer);
       System.out.println(buffer.charAt(2));
       System.out.println(buffer.length());
       System.out.println(buffer.substring(0));
       System.out.println(buffer.substring(0,5));
       buffer.setCharAt(0,'&');
       System.out.println(buffer);
       StringBuffer sb=new StringBuffer();
       System.out.println(sb.capacity());//default -16
       sb.append("hello");
       System.out.println(sb.capacity());
       sb.append("java is my favourite language");//(default*2)+2
       System.out.println(sb.capacity());
      
       
       

	}

}
