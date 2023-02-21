package J06005;

public class Bill {
	
	String ID = "";
	Customer c;
	Merchandise m;
	int amount;
	int balance;
	
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
}
