package Danhsachtrungtuyen;

public class Candidate implements Comparable<Candidate>{
	String ID;
	String name = "";
	double Mat;
	double Phy;
	double Che;
	double bonus;
	double total;
	String result;
	
	public void getName(String s) {
		s = s.toLowerCase();
		String[] tmp = s.split(" ");
		for(String mem: tmp) {
			if(mem.length() > 0) {
				this.name += mem.substring(0,1).toUpperCase() + mem.substring(1, mem.length()) + " ";
			}
		}
		this.name = this.name.trim();
	}
	
	public void getBonus() {
		if(this.ID.substring(2, 3).compareTo("1") == 0)
			this.bonus = 0.5;
		else if(this.ID.substring(2, 3).compareTo("2") == 0)
			this.bonus = 1.0;
		else if(this.ID.substring(2, 3).compareTo("3") == 0)
			this.bonus = 2.5;
	}
	
	public void getTotal() {
		this.total = this.Mat * 2 + this.Phy + this.Che + this.bonus;
	}
	
	@Override
	public int compareTo(Candidate c) {
		if(this.total < c.total)
			return 1;
		else if(this.total == c.total) {
			if(this.ID.compareTo(c.ID) < 0)
				return -1;
			else if(this.ID.compareTo(c.ID) == 0)
				return -0;
			else
				return 1;			
		}
		else
			return -1;
	}
}
