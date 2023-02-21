import java.util.*;
public class J04003_Phanso {
	Scanner input = new Scanner(System.in);
	private long numerator = input.nextLong();	
	private long denominator = input.nextLong();
	
	long GCD(long a, long b) {
		while(b != 0) {
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	
	String solve() {
		long gcd = GCD(numerator,denominator);
		long num = (long) numerator / gcd;
		long den = (long) denominator / gcd;
		return num + "/" + den;
	}
		
	public static void main (String[] args) {
		J04003_Phanso f = new J04003_Phanso();
		if(f.numerator != 0 && f.denominator != 0)
			System.out.println(f.solve());
		
	}
}
