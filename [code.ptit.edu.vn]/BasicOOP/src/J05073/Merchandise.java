package J05073;

public class Merchandise {
	private String ID;
	private long buyPrice;
	private long amount;
	private double tax;
	private double logistic;
	private double sellPrice;
	
	Merchandise(String ID, long buyPrice, long amount){
		this.ID = ID;
		this.buyPrice = buyPrice;
		this.amount = amount;
		this.calFee();
		this.calSellPrice();
	}
	
	public void calFee() {
		if(this.ID.substring(0, 1).compareTo("T") == 0) {
			this.tax = this.buyPrice * this.amount * (double) 29 / 100;
			this.logistic = this.buyPrice * this.amount * (double) 4 / 100;
		}
		else if(this.ID.substring(0, 1).compareTo("C") == 0) {
			this.tax = this.buyPrice * this.amount * (double) 10 / 100;
			this.logistic = this.buyPrice * this.amount * (double) 3 / 100;
		}
		else if(this.ID.substring(0, 1).compareTo("D") == 0) {
			this.tax = this.buyPrice * this.amount * (double) 8 / 100;
			this.logistic = this.buyPrice * this.amount * (double) 2.5 / 100;
		}
		else if(this.ID.substring(0, 1).compareTo("M") == 0) {
			this.tax = this.buyPrice * this.amount * (double) 2 / 100;
			this.logistic = this.buyPrice * this.amount * (double) 0.5 / 100;
		}
		if(this.ID.substring(3).compareTo("C") == 0) {
			this.tax = this.tax * (double) 95 / 100;
		}
	}
	
	public void calSellPrice() {
		this.sellPrice = this.buyPrice * this.amount + this.tax + this.logistic;
		this.sellPrice = this.sellPrice * (double) 120 / 100;
		this.sellPrice = (double) Math.round(this.sellPrice / this.amount * 100) / 100;
	}
	
	@Override
	public String toString() {
		return String.format("%s %.2f\n", this.ID, this.sellPrice);
	}
}
