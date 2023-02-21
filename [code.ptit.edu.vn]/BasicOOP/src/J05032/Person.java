package J05032;

import java.util.Calendar;

public class Person implements Comparable<Person>{
	String name;
	String DoB;
	int date;
	int month;
	int year;
	Calendar dob = Calendar.getInstance();
	
	public void getTime() {
		String[] tmp = this.DoB.split("/");
		this.date = Integer.parseInt(tmp[0]);
		this.month = Integer.parseInt(tmp[1]);
		this.year = Integer.parseInt(tmp[2]);
	}
	
	public void setTime() {
		this.dob.set(this.year, this.month, this.date);
	}
	
	@Override
	public int compareTo(Person p) {
		if(this.dob.compareTo(p.dob) < 0)
			return 1;
		else if(this.dob.compareTo(p.dob) == 0)
			return 0;
		else
			return -1;
	}
}
