import java.util.Scanner;
public class J04010_Point {
	
	private double x;
	private double y;
	
	J04010_Point(){
	}
	
	J04010_Point(double X, double Y){
		x = X;
		y = Y;
	}
	J04010_Point(J04010_Point P){
		x = P.x;
		y = P.y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(J04010_Point P2) {
		return Math.sqrt(Math.pow((x - P2.x), 2) + Math.pow((y - P2.y), 2));
	}
	
	public static double distance(J04010_Point P1, J04010_Point P2) {
		return Math.sqrt(Math.pow((P1.x - P2.x), 2) + Math.pow((P1.y - P2.y), 2));
	}
	
	public String toString() {
		return x + " " + y;
	}
	
	public static boolean check(J04010_Point P1, J04010_Point P2, J04010_Point P3) {
		if(J04010_Point.distance(P1,P2) + J04010_Point.distance(P2,P3) <= J04010_Point.distance(P3,P1))
			return false;
		if(J04010_Point.distance(P1,P2) - J04010_Point.distance(P2,P3) >= J04010_Point.distance(P3,P1))
			return false;
		if(J04010_Point.distance(P2,P3) + J04010_Point.distance(P3,P1) <= J04010_Point.distance(P1,P2))
			return false;
		if(J04010_Point.distance(P2,P3) - J04010_Point.distance(P3,P1) >= J04010_Point.distance(P1,P2))
			return false;
		if(J04010_Point.distance(P3,P1) + J04010_Point.distance(P1,P2) <= J04010_Point.distance(P2,P3))
			return false;
		if(J04010_Point.distance(P3,P1) - J04010_Point.distance(P1,P2) >= J04010_Point.distance(P2,P3))
			return false;
		return true;
	}
	public static double getArea(J04010_Point P1, J04010_Point P2, J04010_Point P3) {
		double a = J04010_Point.distance(P1,P2);
		double b = J04010_Point.distance(P2,P3);
		double c = J04010_Point.distance(P3,P1);
		double index = (double)1 / 4;
		return index * (Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)));
	}
	public static double getInnerRadius(J04010_Point P1, J04010_Point P2, J04010_Point P3) {
		double a = J04010_Point.distance(P1,P2);
		double b = J04010_Point.distance(P2,P3);
		double c = J04010_Point.distance(P3,P1);
		return a * b * c / (4 * J04010_Point.getArea(P1, P2, P3));
	}
	public static double getInnerRoundArea(J04010_Point P1, J04010_Point P2, J04010_Point P3) {
		double R = J04010_Point.getInnerRadius(P1, P2, P3);
		return R * R * (Math.PI);
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			J04010_Point P1 = new J04010_Point();
			P1.x = input.nextDouble();
			P1.y = input.nextDouble();
			
			J04010_Point P2 = new J04010_Point();
			P2.x = input.nextDouble();
			P2.y = input.nextDouble();
			
			J04010_Point P3 = new J04010_Point();
			P3.x = input.nextDouble();
			P3.y = input.nextDouble();
			
			if(J04010_Point.check(P1,P2,P3) == false)
				System.out.print("INVALID");
			else
				System.out.printf("%.3f", J04010_Point.getInnerRoundArea(P1, P2, P3));
			System.out.println();
		}
	}
}