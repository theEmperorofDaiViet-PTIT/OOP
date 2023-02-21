package J06001;

public class Bill {
	
	String ID;
	int amount;
	Merchandise m;
	long balance;
	long discount;
	long afterDiscount;
	
	void getID(int i) {
		ID += "-";
		String subID = "" + i;
		while(subID.length() < 3)
			subID = "0" + subID;
		ID += subID;
	}
	
	void addMerchandise(Merchandise[] Mer) {
		String merID = this.ID.substring(0, 2);
		for(int i = 0; i < Mer.length; i++) {
			if(Mer[i].ID.compareTo(merID) == 0) {
				this.m = Mer[i];
			}
		}
	}
	
	void calculateBalance() {
		if(ID.charAt(2) == '1') {
			this.balance = m.priceTier1 * amount;
		}
		else if(ID.charAt(2) == '2') {
			this.balance = m.priceTier2 * amount;
		}
	}
	void calculateDiscount() {
		if(this.amount >= 150)
			this.discount = this.balance * 50 / 100;
		else if(this.amount >= 100)
			this.discount = this.balance * 30 / 100;
		else if(this.amount >= 50)
			this.discount = this.balance * 15 / 100;
		else
			this.discount = 0;
	}
	void calculateAfterDiscount() {
		this.afterDiscount = this.balance - this.discount;
	}
}
