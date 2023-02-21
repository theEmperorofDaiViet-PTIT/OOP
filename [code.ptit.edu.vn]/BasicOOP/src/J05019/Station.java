package J05019;
import java.util.*;
import java.text.*;
public class Station {
	private String ID;
	private String name;
	private double totalTime;
	private long totalAmount;
	private double average;
	
	Station(int i, String name){
		this.setID(i);
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setID(int i) {
		this.ID = "T" + String.format("%02d", i);
	}
	
	public void addTime(String start, String end)  throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = format.parse(start);
		Date date2 = format.parse(end);
		this.totalTime += (double) (date2.getTime() - date1.getTime()) / 1000 / 60 / 60;
	}
	
	public void addAmount(long amount) {
		this.totalAmount += amount;
	}
	
	public void calAverage() {		
		this.average = (double)Math.round((this.totalAmount / this.totalTime) * 100) / 100;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %.2f\n", this.ID, this.name, this.average);
	}
}





