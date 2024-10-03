

public class binary_decimal {
//Binary to decimal
	public static int bin2dec(int binary)
	{
		int decimal=0,power = 0;
		while(binary!=0)
		{
			int rem=binary%10;
			decimal=(int)(decimal+rem*(Math.pow(2, power)));
			power++;
		}
		return decimal;
	}
	
	public static void main(String[] args) {
	
		System.out.println(binary_decimal.bin2dec(1100));

	}

}
