package J05043;

import java.util.Map;

public class Officer {
	String ID = "NV";
	String name;
	String role;
	int basicSalary;
	int days;
	int Salary;
	int bonus;
	double advanced;
	double remain;
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}
	
	public void getSalary() {
		this.Salary = this.basicSalary * this.days;
	}
	
	public void getBonus(Map<String, Integer> roleBonus) {
		if(roleBonus.containsKey(this.role) == false) {
			this.bonus = 100;
		}
		else {
			this.bonus = roleBonus.get(this.role);
		}
	}
	
	public void getAdvanced() {
		double tmp = (this.Salary + this.bonus ) * (int)2 / 3;
		if(tmp < 25000) {
			this.advanced = Math.round(tmp / 1000) * 1000;
			
		}
		else
			this.advanced = 25000;
	}
	
	public void getRemain() {
		this.remain = this.Salary + this.bonus - this.advanced;
	}
	
}
