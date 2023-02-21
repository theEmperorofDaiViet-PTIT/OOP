package J05081;

public class Merchandise implements Comparable<Merchandise>{
	
	String mID = "MH";
	String name;
	String unit;
	int buyPrice;
	int sellPrice;
	int profit;
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 3) {
			tmp = "0" + tmp;
		}
		this.mID += tmp;
	}
	
	public void getProfit() {
		this.profit = this.sellPrice - this.buyPrice;
	}
		
	@Override
	public int compareTo(Merchandise m) {
		if(this.profit > m.profit)
			return -1;
		else if(this.profit == m.profit) {
			if(this.mID.compareTo(m.mID) < 0)
				return -1;
			else if(this.mID.compareTo(m.mID) == 0)
				return 0;
			else
				return 1;
		}
		else
			return 1;
	}
}
