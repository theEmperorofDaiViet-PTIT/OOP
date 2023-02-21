package J06006;
public class Bill {
	
	String ID = "";
	Customer c;
	Merchandise m;
	int amount;
	int balance;
	int profit;
	
	void setID() {
		while(this.ID.length() < 3) {
			this.ID = "0" + this.ID;
		}
		this.ID = "HD" + this.ID;
	}
	
	void setCustomer(Customer c) {
		this.c = c;
	}
	
	void addMerchandise(Merchandise m) {
		this.m = m;
	}
	
	void addAmount(int a) {
		this.amount = a;
	}
	
	void calculateBalance() {
		this.balance = this.m.sellPrice * this.amount;
	}
	void calculateProfit() {
		this.profit = this.balance - this.amount * this.m.buyPrice;
	}
	public static void sortByProfit(Bill[] Bil) {
		for(int i = 1; i < Bil.length; i++) {
			Bill tmp = Bil[i];
			int j;
			for(j = i - 1; j >= 0; j--) {	
				if(Bil[j].profit < tmp.profit)
					Bil[j + 1] = Bil[j];
				else
					break;			
			}
			Bil[j+1] = tmp;
		}
	}
	
}
