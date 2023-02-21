package J05069;

public class FootballClub {
	private String ID;
	private String name;
	private int price;
	
	FootballClub(String ID, String name, int price){
		this.ID = ID;
		this.name = name;
		this.price = price;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
}
