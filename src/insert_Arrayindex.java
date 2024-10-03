import java.util.Arrays;
public class insert_Arrayindex {
	//insert index in array

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int value=55;
		int index=2;

		System.out.println("Before insert:"+Arrays.toString(a));
		for(int i=a.length-1;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=value;

		System.out.println("After inserting :"+Arrays.toString(a));
		

	}

}
