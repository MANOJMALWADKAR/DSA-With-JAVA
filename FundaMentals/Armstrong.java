import java.lang.Math;

public class Armstrong {
	public static void main(String[] args)
	{

		int n = 1634;
		int temp = n;
		double result = 0;
        int digit =0 ;
 
		while (temp > 0) {
			temp = temp / 10;
             digit++;
		}
        temp =n;
		while (temp > 0) {
			int rem = temp % 10;
			result = (result) + Math.pow(rem, digit);
			temp = temp / 10;            
		}

		if (n == result) {
			System.out.println(" Armstrong No.");
		}
		else {
			System.out.println(
				" not an Armstrong No.");
		}
	}
}
