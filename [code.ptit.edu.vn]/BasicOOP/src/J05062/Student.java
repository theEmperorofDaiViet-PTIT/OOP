package J05062;

public class Student implements Comparable<Student>{
	private String name;
	private double TBC;
	private int RL;
	private String status;
	
	Student(String name, double TBC, int RL){
		this.name = name;
		this.TBC = TBC;
		this.RL = RL;
	}
	
	public double getTBC() {
		return this.TBC;
	}
	
	public void setStatus() {
		this.status = "KHONG";
	}
	
	public void examine() {
		if(this.TBC >= 3.6 && this.RL >= 90)
			this.status = "XUATSAC";
		else if(this.TBC >= 3.2 && this.RL >= 80)
			this.status = "GIOI";
		else if(this.TBC >= 2.5 && this.RL >= 70)
			this.status = "KHA";
		else
			this.status = "KHONG";
	}
	
	@Override
	public int compareTo(Student s) {
		if(this.TBC > s.TBC)
			return -1;
		else if(this.TBC == s.TBC)
			return 0;
		else
			return 1;
	}
	
	@Override
	public String toString() {
		return this.name + ": " + this.status + "\n";
	}
	
}
