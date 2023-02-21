package J05017;
public class Client implements Comparable<Client>{
	private String ID;
	private String name;
	private int index1;
	private int index2;
	private int used;
	private double price;
	
	Client(int i, String name, String index1, String index2){
		this.ID = "KH" + String.format("%02d", i+1);
		this.name = name;
		this.index1 = Integer.parseInt(index1);
		this.index2 = Integer.parseInt(index2);
		this.used = this.index2 - this.index1;
		this.calPrice();
	}
	
	public void calPrice() {
		if(this.used > 100) {
			this.price = (double) 105 / 100 * (50 * 100 + 50 * 150 + (this.used - 100) * 200);
		}
		else if(this.used > 50) {
			this.price = (double) 103 / 100 * (50 * 100 + (this.used - 50) * 150);
		}
		else {
			this.price = (double) 102 / 100 * this.used * 100;
		}
	}
	
	@Override
	public String toString(){
		return String.format("%s %s %d\n", this.ID, this.name, Math.round(this.price));
	}
	
	@Override
	public int compareTo(Client c) {
		if(this.price > c.price)
			return -1;
		else if(this.price == c.price) {
			return (this.ID.compareTo(c.ID) < 0) ? -1 : 1;
		}
		else
			return 1;
	}
}
