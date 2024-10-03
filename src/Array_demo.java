import java.util.*;

public class Array_demo {
//accesing and print elements in array
	public static void main(String[] args) {
	    
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		System.out.print(a[0]);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		for(int x:a)
		{
		System.out.print(x);//enhanced for loop 
		}
		
		//declaration
		int b[];
		b=new int[10];  	
		for(int y:b)
		{
		System.out.print(y);//enhanced for loop 
		}
		int c[]=new int[10];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter value:");
			Scanner in=new Scanner(System.in);
			c[i]=in.nextInt();
			
		}
			for(int k:c)
			{
			System.out.print(k);//enhanced for loop 
			}
		
			
			
			 
		}			
		
		}
		
		
		





