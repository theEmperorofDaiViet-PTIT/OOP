package J1;

public class Subject implements Comparable<Subject>{
	private String ID;
	private String name;
	private String form;
	
	Subject(String ID, String name, String form){
		this.ID = ID;
		this.name = name;
		this.form = form;
	}
	
	@Override
	public int compareTo(Subject s) {
		if(this.ID.compareTo(s.ID) < 0) {
			return -1;
		}
		else
			return 1;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s\n", this.ID, this.name, this.form);
	}
}
