import java.util.*;
public class J04001_Point {

	private double x;
	private double y;
	
	J04001_Point(){
	}
	
	J04001_Point(double X, double Y){
		x = X;
		y = Y;
	}
	J04001_Point(J04001_Point P){
		x = P.x;
		y = P.y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(J04001_Point P2) {
		return Math.sqrt(Math.pow((x - P2.x), 2) + Math.pow((y - P2.y), 2));
	}
	
	public static double distance(J04001_Point P1, J04001_Point P2) {
		return Math.sqrt(Math.pow((P1.x - P2.x), 2) + Math.pow((P1.y - P2.y), 2));
	}
	
	public String toString() {
		return x + " " + y;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			J04001_Point P1 = new J04001_Point();
			P1.x = input.nextDouble();
			P1.y = input.nextDouble();
			
			J04001_Point P2 = new J04001_Point();
			P2.x = input.nextDouble();
			P2.y = input.nextDouble();
			
			System.out.printf("%.4f", distance(P1,P2));
			System.out.println();
		}
		input.close();
	}

}
