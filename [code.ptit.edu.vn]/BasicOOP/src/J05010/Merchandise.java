package J05010;
public class Merchandise implements Comparable<Merchandise>{
	int ID;
	String name;
	String category;
	double buyPrice;
	double sellPrice;
	double profit;
	
	public void getID(int i) {
		this.ID = i;
	}
	
	public void getProfit() {
		this.profit = this.sellPrice - this.buyPrice;
	}
	
	@Override
	public int compareTo(Merchandise m) {
		if(this.profit < m.profit)
			return 1;
		else if(this.profit == m.profit)
			return 0;
		else
			return -1;
	}
	
}