package Sapxepmathang;

public class Merchandise implements Comparable<Merchandise>{
	String ID = "MH";
	String name;
	String category;
	double buyPrice;
	double sellPrice;
	double profit;
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
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
