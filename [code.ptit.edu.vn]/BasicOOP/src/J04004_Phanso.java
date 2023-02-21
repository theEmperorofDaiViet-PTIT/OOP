import java.util.*;
public class J04004_Phanso {
	
	private long numerator;
	private long denominator;
	
	long GCD(long a, long b) {
		while(b != 0) {
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		J04004_Phanso f1 = new J04004_Phanso();
		f1.numerator = input.nextLong();
		f1.denominator = input.nextLong();
		
		J04004_Phanso f2 = new J04004_Phanso();
		f2.numerator = input.nextLong();
		f2.denominator = input.nextLong();
		
		J04004_Phanso f3 = new J04004_Phanso();
		f3.numerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
		f3.denominator = f1.denominator * f2.denominator;
		
		long gcd = f3.GCD(f3.numerator, f3.denominator);
		f3.numerator = (long) f3.numerator / gcd;
		f3.denominator = (long) f3.denominator / gcd;
		
		System.out.println(f3.numerator + "/" + f3.denominator);
		input.close();
	}

}
