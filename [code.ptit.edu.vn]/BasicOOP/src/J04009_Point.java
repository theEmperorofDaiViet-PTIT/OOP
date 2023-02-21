import java.util.*;
public class J04009_Point {
	
	private double x;
	private double y;
	
	J04009_Point(){
	}
	
	J04009_Point(double X, double Y){
		x = X;
		y = Y;
	}
	J04009_Point(J04009_Point P){
		x = P.x;
		y = P.y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(J04009_Point P2) {
		return Math.sqrt(Math.pow((x - P2.x), 2) + Math.pow((y - P2.y), 2));
	}
	
	public static double distance(J04009_Point P1, J04009_Point P2) {
		return Math.sqrt(Math.pow((P1.x - P2.x), 2) + Math.pow((P1.y - P2.y), 2));
	}
	
	public String toString() {
		return x + " " + y;
	}
	
	public static boolean check(J04009_Point P1, J04009_Point P2, J04009_Point P3) {
		if(J04009_Point.distance(P1,P2) + J04009_Point.distance(P2,P3) <= J04009_Point.distance(P3,P1))
			return false;
		if(J04009_Point.distance(P1,P2) - J04009_Point.distance(P2,P3) >= J04009_Point.distance(P3,P1))
			return false;
		if(J04009_Point.distance(P2,P3) + J04009_Point.distance(P3,P1) <= J04009_Point.distance(P1,P2))
			return false;
		if(J04009_Point.distance(P2,P3) - J04009_Point.distance(P3,P1) >= J04009_Point.distance(P1,P2))
			return false;
		if(J04009_Point.distance(P3,P1) + J04009_Point.distance(P1,P2) <= J04009_Point.distance(P2,P3))
			return false;
		if(J04009_Point.distance(P3,P1) - J04009_Point.distance(P1,P2) >= J04009_Point.distance(P2,P3))
			return false;
		return true;
	}
	public static double getArea(J04009_Point P1, J04009_Point P2, J04009_Point P3) {
		double a = J04009_Point.distance(P1,P2);
		double b = J04009_Point.distance(P2,P3);
		double c = J04009_Point.distance(P3,P1);
		double index = (double)1 / 4;
		return index * (Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			J04009_Point P1 = new J04009_Point();
			P1.x = input.nextDouble();
			P1.y = input.nextDouble();
			
			J04009_Point P2 = new J04009_Point();
			P2.x = input.nextDouble();
			P2.y = input.nextDouble();
			
			J04009_Point P3 = new J04009_Point();
			P3.x = input.nextDouble();
			P3.y = input.nextDouble();
			
			if(J04009_Point.check(P1,P2,P3) == false)
				System.out.print("INVALID");
			else
				System.out.printf("%.2f", J04009_Point.getArea(P1, P2, P3));
			System.out.println();
		}
	}
}
