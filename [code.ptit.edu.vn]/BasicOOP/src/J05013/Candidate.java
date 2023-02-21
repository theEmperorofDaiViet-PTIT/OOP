package J05013;
public class Candidate implements Comparable<Candidate>{
	private String ID;
	private String name;
	private double score1;
	private double score2;
	private double agg;
	private String result;
	
	Candidate(int i, String name, String score1, String score2){
		this.ID = "TS" + String.format("%02d", i+1);
		this.name = name;
		this.score1 = this.setScore(score1);
		this.score2 = this.setScore(score2);
		this.agg = (this.score1 + this.score2) / 2;
	}
	
	public double setScore(String s) {
		if(s.compareTo("10") == 0)
			return 10;
		if(s.contains(".") == true) {
			return Double.parseDouble(s);
		}
		else {
			return Double.parseDouble(s.substring(0,1) + "." + s.substring(1));
		}
	}
	
	public void calResult() {
		if(this.agg >= 9.5) 
			this.result = "XUAT SAC";
		else if(this.agg >= 8)
			this.result = "DAT";
		else if(this.agg >= 5)
			this.result = "CAN NHAC";
		else
			this.result = "TRUOT";
	}
	
	@Override
	public int compareTo(Candidate c) {
		if(this.agg < c.agg)
			return 1;
		else if(this.agg == c.agg){
			return 0;
		}
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %.2f %s\n", this.ID, this.name, this.agg, this.result);
	}
}
