package J05008;
import java.util.*;
public class Polygon {
	private ArrayList<Point> edges = new ArrayList<>();
	private double area;
	
	public void addEdge(Point p) {
		this.edges.add(p);
	}
	
	public void calArea() {
		this.edges.add(new Point(this.edges.get(0)));
		double sum1 = 0;
		for(int i = 0; i < edges.size() - 1; i++) {
			sum1 += edges.get(i).getX() * edges.get(i + 1).getY();
		}
		double sum2 = 0;
		for(int i = 0; i < edges.size() - 1; i++) {
			sum2 += edges.get(i).getY() * edges.get(i + 1).getX();
		}
		this.area = (double) (sum1 - sum2) / 2;
	}
	
	@Override
	public String toString() {
		return String.format("%.3f", this.area);
	}
}
