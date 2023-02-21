package J05058;

public class Candidate implements Comparable<Candidate>{
	
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
		return Mat * 2 + Phy + Che + this.bonus();
	}
	
	public String result() {
		if(total() < 24) 
			return "TRUOT";
		else
			return "TRUNG TUYEN";
	}
	
	@Override
	public int compareTo(Candidate c) {
		if(this.total() < c.total())
			return 1;
		else if(this.total() == c.total()) {
			if(this.ID.compareTo(c.ID) < 0)
				return -1;
			else if(this.ID.compareTo(c.ID) == 0)
				return 0;
			else
				return 1;
		}
		else
			return -1;
	}
}