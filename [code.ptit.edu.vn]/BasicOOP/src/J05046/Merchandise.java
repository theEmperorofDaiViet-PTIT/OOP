package J05046;
import java.util.*;
public class Merchandise {
	String name;
	String ID = "";
	long amount;
	long price;
	double discount;
	double payment;

	

	public void getID() {
		String[] tmp = this.name.split(" ");
		for(int i = 0; i < 2; i++) {
			ID += tmp[i].substring(0,1).toUpperCase();
		}

	}
	
	public void getIndex(Map<String,Integer> Putin) {
		if(Putin.containsKey(this.ID) == false)
			Putin.put(this.ID, 1);
		else
			Putin.put(this.ID, Putin.get(this.ID) + 1);
		String tmp2 = "" + Putin.get(this.ID);
		while(tmp2.length() < 2)
			tmp2 = "0" + tmp2;
		ID += tmp2;
	}
	
	
	public void getDiscount() {
		if(this.amount > 10)
			this.discount = this.price * this.amount * (int)5 / 100;
		else if(this.amount >= 8)
			this.discount = this.price * this.amount * (int)2 / 100;
		else if(this.amount >= 5)
			this.discount = this.price * this.amount * (int)1 / 100;
		else
			this.discount = 0;
	}
	
	public void getPayment() {
		this.payment = this.price * this.amount - this.discount;
	}
	
}
