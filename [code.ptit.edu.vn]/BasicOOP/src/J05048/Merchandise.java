package J05048;

public class Merchandise {
	String ID;
	double amountImport;
	double amountExport;
	double price;
	double totalPrice;
	double tax;
	
	public void getAmountExport() {
		if(this.ID.substring(0,1).compareTo("A") == 0) {
			this.amountExport = Math.round(((double)60 / 100) * this.amountImport * 10 + 5) / 10;
		}
		else if(this.ID.substring(0,1).compareTo("B") == 0)
			this.amountExport = Math.round(((double)70 / 100) * this.amountImport * 10 + 5) / 10;
	}
	
	public void getPrice() {
		if(this.ID.substring(ID.length() - 1, ID.length()).compareTo("Y") == 0)
			this.price = 110000;
		else if(this.ID.substring(ID.length() - 1, ID.length()).compareTo("N") == 0)
			this.price = 135000;
	}
	
	public void getTotalPrice() {
		this.totalPrice = this.amountExport * this.price;
	}
	
	public void getTax() {
		if(this.ID.substring(0,1).compareTo("A") == 0
				&& this.ID.substring(ID.length() - 1, ID.length()).compareTo("Y") == 0)
			this.tax = (double)8 / 100 * this.totalPrice;
		else if(this.ID.substring(0,1).compareTo("A") == 0
				&& this.ID.substring(ID.length() - 1, ID.length()).compareTo("N") == 0)
			this.tax = (double)11 / 100 * this.totalPrice;
		else if(this.ID.substring(0,1).compareTo("B") == 0
				&& this.ID.substring(ID.length() - 1, ID.length()).compareTo("Y") == 0)
			this.tax = (double)17 / 100 * this.totalPrice;
		else if(this.ID.substring(0,1).compareTo("B") == 0
				&& this.ID.substring(ID.length() - 1, ID.length()).compareTo("N") == 0)
			this.tax = (double)22 / 100 * this.totalPrice;
	}
}
