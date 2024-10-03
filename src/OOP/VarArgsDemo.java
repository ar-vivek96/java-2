package OOP;

public class VarArgsDemo {

	static int minValue(int... vals){
		int min=Integer.MAX_VALUE;//vals[0];
		for(int k:vals)
		{
			if(k<min)
				min=k;
		}
		return min;
		
		
	}
	public static void main(String[] args) {
		
		int m=minValue(5,2,6);
		System.out.println(m);
		int n=minValue(5,2,6,7,8,6,5,3,90);
		System.out.println(n);
		

	}

}
