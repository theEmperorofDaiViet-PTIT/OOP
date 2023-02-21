package J05075;
public class Student {
	private String ID;
	private String name;
	private String Class;
	private String record;
	private int score;
	private String result;
	
	Student(String ID, String name, String Class){
		this.ID = ID;
		this.name = name;
		this.Class = Class;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getClasses() {
		return this.Class;
	}
	
	public void setRecord(String record) {
		this.record = record;
	}
	
	public void calScore() {
		this.score = 10;
		for(int i = 0; i < this.record.length(); i++) {
			if(this.record.charAt(i) == 'm') {
				this.score -= 1;
			}
			if(this.record.charAt(i) == 'v') {
				this.score -= 2;
			}
		}
		if(this.score < 0)
			this.score = 0;
	}
	
	public void calResult() {
		if(this.score == 0)
			this.result = "KDDK";
		else
			this.result = "";
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s %d %s\n", this.ID, this.name, this.Class, this.score, this.result);
	}
}
