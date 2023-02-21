package J04018;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			ComplexNumber A = new ComplexNumber();
			A.a = input.nextDouble();
			A.b = input.nextDouble();
			ComplexNumber B = new ComplexNumber();
			B.a = input.nextDouble();
			B.b = input.nextDouble();
			if(ComplexNumber.cal1(A, B).a == (int)ComplexNumber.cal1(A, B).a)
				System.out.print((int)ComplexNumber.cal1(A, B).a + " ");				
			else
				System.out.print(ComplexNumber.cal1(A, B).a + " ");
			if(ComplexNumber.cal1(A, B).b > 0)
				System.out.print("+ ");
			else
				System.out.print("- ");
			if(ComplexNumber.cal1(A, B).b == (int)ComplexNumber.cal1(A, B).b)
				System.out.print(Math.abs((int)ComplexNumber.cal1(A, B).b) + "i, ");				
			else
				System.out.print(ComplexNumber.cal1(A, B).b + "i, ");

			
			if(ComplexNumber.cal2(A, B).a == (int)ComplexNumber.cal2(A, B).a)
				System.out.print((int)ComplexNumber.cal2(A, B).a + " ");				
			else
				System.out.print(ComplexNumber.cal2(A, B).a + " ");
			if(ComplexNumber.cal2(A, B).b > 0)
				System.out.print("+ ");
			else
				System.out.print("- ");
			if(ComplexNumber.cal2(A, B).b == (int)ComplexNumber.cal2(A, B).b)
				System.out.println(Math.abs((int)ComplexNumber.cal2(A, B).b) + "i");				
			else
				System.out.println(ComplexNumber.cal2(A, B).b + "i");
			

				
		}

		
		input.close();
	}

}
