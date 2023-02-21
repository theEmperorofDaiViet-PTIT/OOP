package J04011;

public class Vector3D {
	
	public double x;
	public double y;
	public double z;
	
	public static Vector3D getVector(Point3D p1, Point3D p2) {
		Vector3D vec = new Vector3D();
		vec.x = p1.x - p2.x;
		vec.y = p1.y - p2.y;
		vec.z = p1.z - p2.z;
		return vec;
	}
	
	public static Vector3D getCrossProduct(Vector3D vec1, Vector3D vec2) {
		Vector3D vec = new Vector3D();
		vec.x = vec1.y * vec2.z - vec1.z * vec2.y;
		vec.y = vec1.z * vec2.x - vec1.x * vec2.z;
		vec.z = vec1.x * vec2.y - vec1.y * vec2.x;
		return vec;
	}
	
	public static double getScalarMultiplication(Vector3D vec1, Vector3D vec2) {
		return vec1.x * vec2.x + vec1.y * vec2.y + vec1.z * vec2.z;
	}
	
}
