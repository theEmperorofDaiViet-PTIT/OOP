package J05037;

public class Merchandise implements Comparable<Merchandise>{
	String ID = "MH";
	String name;
	String unit;
	long buyPrice;
	int amount;
	double ship;
	double totalPrice;
	double sellPrice;
	
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}
	
	public void getShip() {
		this.ship = Math.round((this.buyPrice * this.amount * (double)5 / 100) * 10 + 5) / 10;
	}
	
	public void getTotalPrice() {
		this.totalPrice = Math.round((this.buyPrice * this.amount + this.ship) * 10 + 5) / 10;		
	}
	
	public void getSellPrice() {
		this.sellPrice = Math.ceil(((this.totalPrice + (double)2 / 100 * this.totalPrice) / amount) / 100) * 100;
	}
	
	@Override
	public int compareTo(Merchandise m) {
		if(this.sellPrice < m.sellPrice)
			return 1;
		else if(this.sellPrice == m.sellPrice)
			return 0;
		else
			return -1;
	}
}