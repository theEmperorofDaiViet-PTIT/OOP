package J05078;

public class Department {
	private String ID;
	private String name;
	
	Department(String ID, String name){
		this.ID = ID;
		this.name = name.trim();
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
}
