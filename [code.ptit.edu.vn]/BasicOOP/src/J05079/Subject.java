package J05079;

public class Subject {
	private String ID;
	private String name;
	
	Subject(String ID, String name){
		this.ID = ID;
		this.name = name;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
}
