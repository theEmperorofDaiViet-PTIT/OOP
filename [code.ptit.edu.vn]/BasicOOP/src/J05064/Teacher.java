package J05064;

public class Teacher {
	String code ;
	String name;
	int rawSalary;	
	String role;
	int index;
	int bonus;
	int income;
	
	public void getRole() {
		this.role = this.code.substring(0,2);
	}
	
	public void getIndex() {
		this.index = Integer.parseInt(this.code.substring(2));
	}

	public void getBonus() {
		if(this.role.compareTo("HT") == 0)
			this.bonus = 2000000;
		else if(this.role.compareTo("HP") == 0)
			this.bonus = 900000;
		else if(this.role.compareTo("GV") == 0)
			this.bonus = 500000;
	}
	
	public void getIncome() {
		this.income = this.index * this.rawSalary + this.bonus;
	}
	
	
}
