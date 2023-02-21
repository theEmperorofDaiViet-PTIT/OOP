package J05012;
import java.math.*;
public class Bill implements Comparable<Bill>{
	private String merID;
	private String merName;
	private BigInteger price;
	private BigInteger amount;
	private BigInteger discount;
	private BigInteger payment;
	
	Bill(String merID, String merName, String amount, String price, String discount){
		this.merID = merID;
		this.merName = merName;
		this.price = new BigInteger(price);
		this.amount = new BigInteger(amount);
		this.discount = new BigInteger(discount);
	}
	
	public void calPayment() {
		this.payment = (this.price.multiply(this.amount)).subtract(this.discount);
	}
	
	@Override
	public int compareTo(Bill b) {
		if(this.payment.compareTo(b.payment) < 0)
			return 1;
		else if(this.payment.compareTo(b.payment) == 0)
			return 0;
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s %s %s %s\n", this.merID, this.merName, this.amount.toString(),
				this.price.toString(), this.discount.toString(), this.payment.toString());
	}
}