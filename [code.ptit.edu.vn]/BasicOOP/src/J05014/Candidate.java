package J05014;

public class Candidate implements Comparable<Candidate>{
	private String ID;
	private String name;
	private String canID;
	private String major;
	private double score1;
	private double score2;
	private double bonus;
	private double total;
	private String result;
	
	Candidate(int i, String name, String canID, String score1, String score2){
		this.ID = "GV" + String.format("%02d", i+1);
		this.name = name;
		this.canID = canID;
		this.score1 = Double.parseDouble(score1);
		this.score2 = Double.parseDouble(score2);
		this.calMajor();
		this.calBonus();
		this.total = this.score1 * 2 + this.score2 + this.bonus;
		this.calRes();
	}
	
	public void calMajor() {
		if(this.canID.substring(0,1).compareTo("A") == 0)
			this.major = "TOAN";
		else if(this.canID.substring(0,1).compareTo("B") == 0)
			this.major = "LY";
		else if(this.canID.substring(0,1).compareTo("C") == 0)
			this.major = "HOA";
	}
	
	public void calBonus() {
		if(this.canID.substring(1).compareTo("1") == 0)
			this.bonus = 2.0;
		else if(this.canID.substring(1).compareTo("2") == 0)
			this.bonus = 1.5;
		else if(this.canID.substring(1).compareTo("3") == 0)
			this.bonus = 1.0;
		else if(this.canID.substring(1).compareTo("4") == 0)
			this.bonus = 0.0;
	}
	
	public void calRes() {
		if(this.total < 18)
			this.result = "LOAI";
		else
			this.result = "TRUNG TUYEN";
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s %.1f %s\n", this.ID, this.name, this.major, this.total, this.result);
	}
	
	@Override
	public int compareTo(Candidate c) {
		if(this.total > c.total)
			return -1;
		else if(this.total == c.total)
			return 0;
		else
			return 1;
	}
}
