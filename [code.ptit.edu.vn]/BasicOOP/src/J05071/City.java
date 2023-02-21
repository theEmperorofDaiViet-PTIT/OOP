package J05071;

public class City {
	private String ID;
	private String name;
	private long pricePerMin;
	
	City(String ID, String name, long pricePerMin){
		this.ID = ID;
		this.name = name;
		this.pricePerMin = pricePerMin;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	public long getPrice() {
		return this.pricePerMin;
	}
	
	
	
}
