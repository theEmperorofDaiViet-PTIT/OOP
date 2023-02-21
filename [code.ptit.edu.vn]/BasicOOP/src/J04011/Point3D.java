package J04011;

public class Point3D {
	
	public double x;
	public double y;
	public double z;
	
	Point3D(double X, double Y, double Z){
		x = X;
		y = Y;
		z = Z;
	}
	
	public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
		Vector3D p1p2 = Vector3D.getVector(p1, p2);
		Vector3D p1p3 = Vector3D.getVector(p1, p3);
		Vector3D p1p4 = Vector3D.getVector(p1, p4);
		
		Vector3D vec = Vector3D.getCrossProduct(p1p2, p1p3);
		double mul = Vector3D.getScalarMultiplication(vec, p1p4);
		if(mul == 0)
			return true;
		return false;
	}
}
