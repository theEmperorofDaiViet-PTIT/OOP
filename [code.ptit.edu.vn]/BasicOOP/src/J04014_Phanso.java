import java.util.*;
public class J04014_Phanso {
	
	private long numerator;
	private long denominator;
	
	J04014_Phanso(){
	}
	J04014_Phanso(long a, long b){
		numerator = a;
		denominator = b;
	}
	public static long GCD(long a, long b) {
		while(b != 0) {
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	public static J04014_Phanso getSimplicity(J04014_Phanso f) {
		long gcd = GCD(f.numerator,f.denominator);
		if(f.numerator != 0) {
			f.numerator = (long) f.numerator / gcd;
			f.denominator = (long) f.denominator / gcd;
		}
		return f;
	}
	public static int getSign(J04014_Phanso f) {
		if(f.numerator * f.denominator < 0)
			return -1;
		else if (f.numerator * f.denominator == 0)
			return 0;
		else
			return 1;
	}
	public static J04014_Phanso getPositive(J04014_Phanso f) {
		f.numerator = Math.abs(f.numerator);
		f.denominator = Math.abs(f.denominator);
		return f;
	}
	public static J04014_Phanso cal1(J04014_Phanso f1, J04014_Phanso f2) {
		
		J04014_Phanso f3 = new J04014_Phanso();
		f3.numerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
		f3.denominator = f1.denominator * f2.denominator;
		f3.numerator *= f3.numerator;
		f3.denominator *= f3.denominator;
		return J04014_Phanso.getSimplicity(f3);
	}
	public static J04014_Phanso cal2(J04014_Phanso f1, J04014_Phanso f2, J04014_Phanso f3) {
		
		J04014_Phanso f4 = new J04014_Phanso();
		f4.numerator = f1.numerator * f2.numerator * f3.numerator;
		f4.denominator = f1.denominator * f2.denominator * f3.denominator;
		if(J04014_Phanso.getSign(f4) == -1) {
			J04014_Phanso.getPositive(f4);
			J04014_Phanso.getSimplicity(f4);
			f4.numerator = - f4.numerator;
			return f4;
		}
		return J04014_Phanso.getSimplicity(f4);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			J04014_Phanso f1 =  new J04014_Phanso(input.nextLong(),input.nextLong());
			J04014_Phanso f2 =  new J04014_Phanso(input.nextLong(),input.nextLong());
			J04014_Phanso F1 = J04014_Phanso.cal1(f1, f2);
			J04014_Phanso F2 = J04014_Phanso.cal2(f1, f2, F1);
			
			System.out.print(F1.numerator + "/" + F1.denominator + " ");
			System.out.print(F2.numerator + "/" + F2.denominator);
			System.out.println();
		}
		input.close();
	}
}