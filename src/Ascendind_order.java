import java.util.Arrays;
public class Ascendind_order {

	public static void main(String[] args) {

		int a[]=new int[] {8,2,9,7,33,3,87};
		System.out.println("Before Sorting :"+Arrays.toString(a));
		 
		int t;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}

		System.out.println("aftere Sorting :"+Arrays.toString(a));
		

	}

}
