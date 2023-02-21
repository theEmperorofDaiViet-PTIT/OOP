import java.util.*;

public class J04013_Thisinh {
	
	J04013_Thisinh(String a, String b, double c, double d, double e){
		ID = a;
		name = b;
		Mat = c;
		Phy = d;
		Che = e;
	}
	private String ID;
	private String name;
	private double Mat;
	private double Phy;
	private double Che;
	
	public double bonus() {
		if(ID.substring(0,3).compareTo("KV1") == 0)
			return 0.5;
		if(ID.substring(0,3).compareTo("KV2") == 0)
			return 1.0;
		else
			return 2.5;
	}
	
	public double total() {
		return Mat * 2 + Phy + Che;
	}
	
	public boolean result() {
		if(total() + bonus() < 24) 
			return false;
		else
			return true;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		J04013_Thisinh stu = new J04013_Thisinh(input.nextLine(), input.nextLine(), 
				input.nextDouble(),	input.nextDouble(), input.nextDouble());
		String result = (stu.result() == true) ? "TRUNG TUYEN" : "TRUOT";
		
		
		System.out.printf("%s %s", stu.ID, stu.name);
		if(stu.bonus() == (int)stu.bonus())
			System.out.printf(" %d",(int)stu.bonus());
		else
			System.out.printf(" %.1f",stu.bonus());
		if(stu.total() == (int)stu.total())
			System.out.printf(" %d %s",(int)stu.total(), result);
		else
			System.out.printf(" %.1f %s",stu.total(), result);
		
		input.close();
	}
}

