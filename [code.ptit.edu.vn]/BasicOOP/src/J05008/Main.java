package J05008;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			Polygon Po = new Polygon();
			int amount = input.nextInt();
			for(int i = 0; i < amount; i++) {
				Point p = new Point(input.nextDouble(), input.nextDouble());
				Po.addEdge(p);
			}
			Po.calArea();
			System.out.println(Po.toString());
		}
		input.close();
	}

}
