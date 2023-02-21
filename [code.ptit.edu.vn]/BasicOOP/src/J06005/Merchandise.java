package J06005;

public class Merchandise {
	
	String ID = "";
	String name;
	String unit;
	int buyPrice;
	int sellPrice;
	
	void setID() {
		while(this.ID.length() < 3) {
			this.ID = "0" + this.ID;
		}
		this.ID = "MH" + this.ID;
	}
	
}
