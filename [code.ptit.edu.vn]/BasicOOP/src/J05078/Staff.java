package J05078;
import java.util.*;
public class Staff {
	private String ID;
	private String name;
	private char tier;
	private int years;
	private Department De;
	private long basicSalary;
	private int days;
	private int index;
	private long salary;
	
	Staff(String line1, String line2, String line3, String line4){
		this.ID = line1;
		this.name = line2;
		this.basicSalary = Integer.parseInt(line3);
		this.days = Integer.parseInt(line4);
		this.calTier();
		this.calYears();
		this.calIndex();
		this.calSalary();
	}
	
	public void calDepartment(ArrayList<Department> Dep) {
		for(Department mem: Dep) {
			if(this.ID.substring(3, 5).compareTo(mem.getID()) == 0) {
				this.De = mem;
				break;
			}
		}
	}
	
	public void calTier() {
		this.tier = this.ID.charAt(0);
	}
	
	public void calYears() {
		this.years = Integer.parseInt(this.ID.substring(1,3));
	}
	
	public void calIndex() {
		if(this.years >= 16) {
			if(this.tier == 'A')
				this.index = 20;
			else if(this.tier == 'B')
				this.index = 16;
			else if(this.tier == 'C')
				this.index = 14;
			else if(this.tier == 'D')
				this.index = 13;
		}
		else if(this.years >= 9) {
			if(this.tier == 'A')
				this.index = 14;
			else if(this.tier == 'B')
				this.index = 13;
			else if(this.tier == 'C')
				this.index = 12;
			else if(this.tier == 'D')
				this.index = 11;
		}
		else if(this.years >= 4) {
			if(this.tier == 'A')
				this.index = 12;
			else if(this.tier == 'B')
				this.index = 11;
			else if(this.tier == 'C')
				this.index = 10;
			else if(this.tier == 'D')
				this.index = 9;
		}
		else if(this.years >= 1) {
			if(this.tier == 'A')
				this.index = 10;
			else if(this.tier == 'B')
				this.index = 10;
			else if(this.tier == 'C')
				this.index = 9;
			else if(this.tier == 'D')
				this.index = 8;
		}
	}
	
	public void calSalary() {
		this.salary = this.basicSalary * this.days * this.index * 1000;
	}
	
	public Department getDepartment() {
		return this.De;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %d\n", this.ID, this.name, this.salary);
	}
	
}
