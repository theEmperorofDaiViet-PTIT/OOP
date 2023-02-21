package J05055;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.text.*;

public class Athlete implements Comparable<Athlete>{
	private String name;
	private String ID;
	private String dob;
	private int age;
	private Date start;
	private Date end;
	private String result;
	private String minus;
	private String finalResult;
	private long realFinalResult;
	private int ranking;
	
	Athlete(String name, String dob, String start, String end, int i) throws ParseException{
		this.name = name;
		this.dob = dob;
		this.start = new SimpleDateFormat("HH:mm:ss").parse(start);
		this.end = new SimpleDateFormat("HH:mm:ss").parse(end);
		this.calAge();
		this.calMinus();
		this.calResult();
		this.ID = "VDV" + String.format("%02d", i);
	}
	
	public void calAge() {
		String birthYear = this.dob.split("/")[2];
		this.age = 2021 - Integer.parseInt(birthYear);
	}
	
	public void calMinus() {
		if(this.age >= 32) {
			this.minus = "00:00:03";
		}
		else if(this.age >= 25) {
			this.minus = "00:00:02";
		}
		else if(this.age >= 18) {
			this.minus = "00:00:01";
		}
		else
			this.minus = "00:00:00";
	}
	
	public void calResult() {
		LocalTime s = LocalTime.parse(new SimpleDateFormat("HH:mm:ss").format(start));
		LocalTime e = LocalTime.parse(new SimpleDateFormat("HH:mm:ss").format(end));
		LocalTime m = LocalTime.parse(this.minus);
		
		long res = ChronoUnit.SECONDS.between(s, e);
		this.result = LocalTime.ofSecondOfDay(res).toString();
		this.finalResult = LocalTime.ofSecondOfDay(res).minusSeconds(m.getSecond()).toString();
	}
	
	@Override
	public int compareTo(Athlete A) {
		LocalTime a = LocalTime.parse(this.finalResult);
		LocalTime b = LocalTime.parse(A.finalResult);
		if(a.compareTo(b) < 0)
			return -1;
		else if(a.compareTo(b) == 0)
			return 0;
		else
			return 1;
	}
	
	public int getRank() {
		return this.ranking;
	}
	
	public void setRank(int ranking) {
		this.ranking = ranking;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s %s %s %d", this.ID, this.name, this.result, this.minus, this.finalResult, this.ranking);
	}
}
