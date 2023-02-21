package J06005;

public class Customer {
	
	String ID = "";
	String name;
	String sex;
	String dob;
	String address;
	
	void setID() {
		while(this.ID.length() < 3) {
			this.ID = "0" + this.ID;
		}
		this.ID = "KH" + this.ID;
	}
	
}
