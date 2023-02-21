package J05009;

public class Candidate implements Comparable<Candidate>{
	private int ID;
	private String name;
	private String dob;
	private double score1;
	private double score2;
	private double score3;
	private double totalScore;
	
	Candidate(int i, String line1, String line2, String line3, String line4,
			String line5){
		this.ID = i;
		this.name = line1;
		this.dob = line2;
		this.score1 = Double.parseDouble(line3);
		this.score2 = Double.parseDouble(line4);
		this.score3 = Double.parseDouble(line5);
		this.totalScore = this.score1 + this.score2 + this.score3;
		
	}
	
	public double getTotalScore() {
		return this.totalScore;
	}
	@Override
	public int compareTo(Candidate c) {
		if(this.totalScore < c.totalScore)
			return 1;
		else if(this.totalScore == c.totalScore) {
			if(this.ID < c.ID)
				return -1;
			else if(this.ID == c.ID)
				return 0;
			else
				return 1;
		}
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return this.ID + " " + this.name + " " + this.dob + " " + String.format("%.1f", this.totalScore);
	}
}
