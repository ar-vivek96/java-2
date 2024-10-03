
public class jagged_Array {

	public static void main(String[] args) { // jagged Array
		int a[][]= {
					{10,20,30,50},
					{10,20,30},
					{10,20,30,40}
		};

	/*	int j,i;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
			
		}
	*/
		for(int k[]:a)
		{
			for(int l:k)
			{
				System.out.print(" "+l);  //enhanced for loop
			}
			System.out.println("");
		}

}
}
