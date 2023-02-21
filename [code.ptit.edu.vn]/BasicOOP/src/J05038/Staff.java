package J05038;
import java.util.*;
public class Staff {
	String ID = "NV";
	String name;
	long wage;
	int days;
	long salary;
	long reward;
	String role;
	long bonus;
	long payment;
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}

	public void getSalary() {
		this.salary = this.wage * this.days;
	}
	
	public void getReward() {
		if(this.days >= 25)
			this.reward = this.salary * (int)20 / 100;
		else if(this.days >= 22)
			this.reward = this.salary * (int)10 / 100;
		else
			this.reward = 0;
	}
	
	public void getBonus() {
		if(this.role.compareTo("GD") == 0)
			this.bonus = 250000;
		else if(this.role.compareTo("PGD") == 0)
			this.bonus = 200000;
		else if(this.role.compareTo("TP") == 0)
			this.bonus = 180000;
		else if(this.role.compareTo("NV") == 0)
			this.bonus = 150000;		
	}
	
	public void getPayment() {
		this.payment = this.salary + this.reward + this.bonus;
	}
	public static void getTotal(ArrayList<Staff> St) {
		long total = 0;
		for(Staff mem: St) {
			total += mem.payment;
		}
		System.out.printf("Tong chi phi tien luong: %d", total);
	}
}
