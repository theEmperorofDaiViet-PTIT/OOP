package J05052;

public class Bill {
	String name;
	String ID;
	String order;
	long price;
	int amount;
	long totalPrice;
	long discount;
	long payment;
	
	public void getOrder() {
		this.order = this.ID.substring(1,4);
	}
	
	public void getTotalPrice() {
		this.totalPrice = this.price * this.amount;
	}
	
	public void getDiscount() {
		if(this.ID.substring(4, 5).compareTo("1") == 0) {
			this.discount = this.totalPrice * (long)50 / 100;
		}
		else if(this.ID.substring(4, 5).compareTo("2") == 0)
			this.discount = this.totalPrice * (long)30 / 100;
	}
	
	public void getPayment() {
		this.payment = this.totalPrice - this.discount;
	}
}
