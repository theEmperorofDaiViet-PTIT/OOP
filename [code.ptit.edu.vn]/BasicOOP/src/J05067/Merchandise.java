package J05067;

import java.util.*;

public class Merchandise {
	private String ID;
	private String brand;
	private long price;
	private int amount;
	private double tax;
	private double payment;
	
	Merchandise(String ID, int amount){
		this.ID = ID;
		this.amount = amount;
		setBrand(Main.Brand);
		calPrice();
		calTax();
		calPayment();
		
	}
	
	public void setBrand(Map<String, String> Brand) {
		this.brand = Brand.get(this.ID.substring(this.ID.length() - 2));
	}
	
	public void calPrice() {
		if(this.ID.substring(0,1).compareTo("X") == 0)
			this.price = 128000;
		else if(this.ID.substring(0,1).compareTo("D") == 0)
			this.price = 11200;
		else if(this.ID.substring(0,1).compareTo("N") == 0)
			this.price = 9700;
	}
	
	public void calTax() {
		if(this.ID.substring(this.ID.length() - 2).compareTo("TN") == 0)
			this.tax = 0;
		else {
			if(this.ID.substring(0,1).compareTo("X") == 0)
				this.tax = (double)3 / 100 * this.price * this.amount;
			else if(this.ID.substring(0,1).compareTo("D") == 0)
				this.tax = (double)3.5 / 100 * this.price * this.amount;
			else if(this.ID.substring(0,1).compareTo("N") == 0)
				this.tax = (double)2 / 100 * this.price * this.amount;
		}
	}
	
	public void calPayment() {
		this.payment = this.price * this.amount + this.tax;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %d %.0f %.0f\n",this.ID, this.brand, this.price, this.tax, this.payment);
	}
}
