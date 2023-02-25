package Tinhtienphong;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Guest implements Comparable<Guest>{
	String ID = "KH";
	String name = "";
	String room;
	String checkIn = "";
	String checkOut = "";
	long days;
	int pricePerDay;
	int fee;
	long totalPrice;
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}
	
	public void getName(String name) {
		name = name.toLowerCase();
		String[] tmp = name.split(" ");
		for(String mem: tmp) {
			if(mem.length() > 0) {
				this.name += mem.substring(0,1).toUpperCase() + mem.substring(1,mem.length()) + " ";
			}
		}
		this.name = this.name.trim();
	}
	
	public void getPricePerDay() {
		String floor = this.room.substring(0,1);
		if(floor.compareTo("1") == 0)
			this.pricePerDay = 25;
		else if(floor.compareTo("2") == 0)
			this.pricePerDay = 34;
		else if(floor.compareTo("3") == 0)
			this.pricePerDay = 50;
		else if(floor.compareTo("4") == 0)
			this.pricePerDay = 80;
	}
	
	public void formatDayIn(String dmy) {
		String[] tmp = dmy.split("/");
		for(int i = 0; i < 3; i++) {
			if(i < 2) {
				while(tmp[i].length() < 2)
					tmp[i] = "0" + tmp[i];
			}
		}
		for(int i = 2; i >= 0; i--) {			
			this.checkIn += tmp[i];
			if(i > 0)
				this.checkIn += "-";
		}
	}
	public void formatDayOut(String dmy) {
		String[] tmp = dmy.split("/");
		for(int i = 0; i < 3; i++) {
			if(i < 2) {
				while(tmp[i].length() < 2)
					tmp[i] = "0" + tmp[i];
			}
		}
		for(int i = 2; i >= 0; i--) {			
			this.checkOut += tmp[i];
			if(i > 0)
				this.checkOut += "-";
		}
	}
	
	public void calculateDate() {
		LocalDate firstDate = LocalDate.parse(this.checkIn);
		LocalDate lastDate = LocalDate.parse(this.checkOut);
		this.days = ChronoUnit.DAYS.between(firstDate, lastDate) + 1;
	}
	
	public void getTotalPrice() {
		this.totalPrice = this.pricePerDay * this.days + this.fee;
	}
	
	@Override
	public int compareTo(Guest g) {
		if(this.totalPrice < g.totalPrice)
			return 1;
		else if(this.totalPrice == g.totalPrice)
			return 0;
		else
			return -1;
	}
	
}
