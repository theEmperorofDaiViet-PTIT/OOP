import java.util.*;
public class J04008_Point {
	
	private double x;
	private double y;
	
	J04008_Point(){
	}
	
	J04008_Point(double X, double Y){
		x = X;
		y = Y;
	}
	J04008_Point(J04008_Point P){
		x = P.x;
		y = P.y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(J04008_Point P2) {
		return Math.sqrt(Math.pow((x - P2.x), 2) + Math.pow((y - P2.y), 2));
	}
	
	public static double distance(J04008_Point P1, J04008_Point P2) {
		return Math.sqrt(Math.pow((P1.x - P2.x), 2) + Math.pow((P1.y - P2.y), 2));
	}
	
	public String toString() {
		return x + " " + y;
	}
	
	public static boolean check(J04008_Point P1, J04008_Point P2, J04008_Point P3) {
		if(J04008_Point.distance(P1,P2) + J04008_Point.distance(P2,P3) <= J04008_Point.distance(P3,P1))
			return false;
		if(J04008_Point.distance(P1,P2) - J04008_Point.distance(P2,P3) >= J04008_Point.distance(P3,P1))
			return false;
		if(J04008_Point.distance(P2,P3) + J04008_Point.distance(P3,P1) <= J04008_Point.distance(P1,P2))
			return false;
		if(J04008_Point.distance(P2,P3) - J04008_Point.distance(P3,P1) >= J04008_Point.distance(P1,P2))
			return false;
		if(J04008_Point.distance(P3,P1) + J04008_Point.distance(P1,P2) <= J04008_Point.distance(P2,P3))
			return false;
		if(J04008_Point.distance(P3,P1) - J04008_Point.distance(P1,P2) >= J04008_Point.distance(P2,P3))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			J04008_Point P1 = new J04008_Point();
			P1.x = input.nextDouble();
			P1.y = input.nextDouble();
			
			J04008_Point P2 = new J04008_Point();
			P2.x = input.nextDouble();
			P2.y = input.nextDouble();
			
			J04008_Point P3 = new J04008_Point();
			P3.x = input.nextDouble();
			P3.y = input.nextDouble();
			
			if(J04008_Point.check(P1,P2,P3) == false)
				System.out.print("INVALID");
			else
				System.out.printf("%.3f", (J04008_Point.distance(P1,P2) + J04008_Point.distance(P2,P3) + J04008_Point.distance(P3,P1)));
			System.out.println();
		}

	}

}
