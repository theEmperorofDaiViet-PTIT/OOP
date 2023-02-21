package J05050;

public class Client {
	String ID = "KH";
	String type;
	int oldIndex;
	int	newIndex;
	int X;
	long Price;
	double bonus;
	double payment;
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}
	
	public void getX() {
		if(this.type.compareTo("KD") == 0)
			this.X = 3;
		else if(this.type.compareTo("NN") == 0)
			this.X = 5;
		else if(this.type.compareTo("TT") == 0)
			this.X= 4;
		else if(this.type.compareTo("CN") == 0)
			this.X = 2;
	}
	
	public void getPrice() {
		this.Price = (this.newIndex - this.oldIndex) * this.X * 550; 
	}
	
	public void getBonus() {
		if(this.newIndex - this.oldIndex > 100)
			this.bonus = this.Price;
		else if(this.newIndex - this.oldIndex >= 50)
			this.bonus = Math.round((this.Price * (double)35 / 100) * 10 + 5) / 10;
		else
			this.bonus = 0;			
	}
	
	public void getPayment() {
		this.payment = this.Price + this.bonus;
	}

}
