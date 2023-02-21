package J05016a;

import java.text.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Guest implements Comparable<Guest>{
	private String name;
	private String ID;
	private String room;
	private String dayIN, dayOUT;
	private int days;
	private int pricePerDay;
	private int totalPrice;
	private int fee;
	
	Guest(String name, int i, String room, String dayIN, String dayOUT, int fee) throws ParseException{
		this.name = name.trim();
		this.ID = "KH" + String.format("%02d", i);
		this.room = room.trim();
		this.fee = fee;
		Date d1 = (new SimpleDateFormat("dd/MM/yyyy").parse(dayIN));
		this.dayIN = new SimpleDateFormat("yyyy-MM-dd").format(d1);
		Date d2 = (new SimpleDateFormat("dd/MM/yyyy").parse(dayOUT));
		this.dayOUT = new SimpleDateFormat("yyyy-MM-dd").format(d2);
		this.calPricePerDay();
		this.calDays();
		this.calPrice();
	}
	
	public void calPricePerDay() {
		if(this.room.substring(0, 1).compareTo("1") == 0) {
			this.pricePerDay = 25;
		}
		else if(this.room.substring(0, 1).compareTo("2") == 0) {
			this.pricePerDay = 34;
		}
		else if(this.room.substring(0, 1).compareTo("3") == 0) {
			this.pricePerDay = 50;
		}
		else
			this.pricePerDay = 80;
	}
	
	public void calDays() {
		LocalDate s = LocalDate.parse(dayIN);
		LocalDate e = LocalDate.parse(dayOUT);
		this.days = (int)ChronoUnit.DAYS.between(s, e) + 1;
	}
	
	public void calPrice() {
		this.totalPrice = this.pricePerDay * this.days + this.fee;
	}
	
	@Override
	public int compareTo(Guest g) {
		if(this.totalPrice > g.totalPrice)
			return -1;
		else if(this.totalPrice == g.totalPrice){
			if(this.ID.compareTo(g.ID) < 0)
				return -1;
			else
				return 1;
		}
		else
			return 1;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s %d %d\n", this.ID, this.name, this.room, this.days, this.totalPrice);
	}
}
