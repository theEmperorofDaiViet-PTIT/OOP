package J04018;

public class ComplexNumber {
	double a;
	double b;
	
	public static ComplexNumber cal1(ComplexNumber A, ComplexNumber B) {
		ComplexNumber res = new ComplexNumber();
		res.a = A.a * A.a - A.b * A.b + A.a * B.a - A.b * B.b;
		res.b = A.a * B.b + A.b * B.a + 2 * A.a * A.b;
		return res;
	}
	public static ComplexNumber cal2(ComplexNumber A, ComplexNumber B) {
		ComplexNumber res = new ComplexNumber();
		res.a = (A.a + B.a) * (A.a + B.a) - (A.b + B.b) * (A.b + B.b);
		res.b = 2 * (A.a + B.a) * (A.b + B.b);
		return res;
		
	}
	
}
