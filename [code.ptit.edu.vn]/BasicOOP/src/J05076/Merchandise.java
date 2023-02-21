package J05076;

public class Merchandise {
	private String ID;
	private String name;
	private String tier;
	
	Merchandise(String ID, String name, String tier){
		this.ID = ID;
		this.name = name;
		this.tier = tier.trim();
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTier() {
		return this.tier;
	}
}
