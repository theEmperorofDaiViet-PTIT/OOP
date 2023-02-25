package Xettuyen;

public class Candidate {
	String ID = "PH";
	String name = "";
	String dob = "";
	int yob;
	int age;
	double test1;
	double test2;
	double bonus;
	double total;
	String tier;
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}
	
	public void getName(String s) {
		s = s.toLowerCase();
		String[] tmp = s.split(" ");
		for(String mem: tmp) {
			if(mem.length() > 0) {
				this.name += mem.substring(0,1).toUpperCase() + mem.substring(1, mem.length()) + " ";
			}
		}
		this.name = this.name.trim();
	}
	
	public void getDoB(String dmy) {
		String[] tmp = dmy.split("/");
		for(int i = 0; i < 3; i++) {
			if(i < 2) {
				while(tmp[i].length() < 2)
					tmp[i] = "0" + tmp[i];
			}
		}
		for(int i = 0; i < 2; i++) {			
			this.dob += tmp[i];
			if(i < 1)
				this.dob += "/";
		}
		this.yob = Integer.parseInt(tmp[2]);
	}
	
	public void getAge() {
		this.age = 2021 - this.yob;
	}
	
	public void getBonus() {
		if(this.test1 >= 8 && this.test2 >= 8) {
			this.bonus = 1;
		}
		else if(this.test1 >= 7.5 && this.test2 >= 7.5)
			this.bonus = 0.5;
		else
			this.bonus = 0;
	}
	
	public void getTotal() {
		this.total = Math.round((((this.test1 + this.test2) / 2) + this.bonus) * 10 + 5) / 10;
		if(this.total > 10)
			this.total = 10;
	}
	
	public void getTier() {
		if(this.total >= 9)
			this.tier = "Xuat sac";
		else if(this.total >= 8)
			this.tier = "Gioi";
		else if(this.total >= 7)
			this.tier = "Kha";
		else if(this.total >= 5)
			this.tier = "Trung binh";
		else
			this.tier = "Truot";
	}
}
