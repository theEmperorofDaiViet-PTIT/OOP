package J05057;

public class Candidate {
	
	Candidate(){		
	}
	
	Candidate(String a, String b, double c, double d, double e){
		ID = a;
		name = b;
		Mat = c;
		Phy = d;
		Che = e;
	}
	String ID;
	String name;
	double Mat;
	double Phy;
	double Che;
	
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
	
	public String result() {
		if(total() + bonus() < 24) 
			return "TRUOT";
		else
			return "TRUNG TUYEN";
	}
}