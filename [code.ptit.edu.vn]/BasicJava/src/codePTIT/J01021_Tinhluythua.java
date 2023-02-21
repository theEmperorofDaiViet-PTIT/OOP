package codePTIT;
import java.util.*;
import java.math.*;
public class J01021_Tinhluythua {
	static final long M = 1000000007;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			long a = input.nextLong();
			long b = input.nextLong();
			if(a == 0 && b == 0){
				break;
			}
			System.out.println(calculate(a,b));
		}

	}
	
	public static long calculate(long a, long b) {
		double result = 1;
		a = a % M;
		long B = b % (M - 1);
		result = Math.pow(a,B) % M;
		
		return (long) result;
	}

}
