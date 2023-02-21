package J05071;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Call {
	private String receiver;
	private City destination;
	private String start;
	private String end;
	private long minutes;
	private long Price;
	
	Call(String receiver, String start, String end){
		this.receiver = receiver;
		this.start = start;
		this.end = end;
		this.calMin();
		
	}
	
	public void calMin() {
		LocalTime s = LocalTime.parse(this.start);
		LocalTime e = LocalTime.parse(this.end);
		
		this.minutes = ChronoUnit.MINUTES.between(s, e);
	}
	
	public void checkDiscount(ArrayList<City> C) {
		if(this.receiver.substring(0, 1).compareTo("0") == 0) {
			for(City c: C) {
				if(this.receiver.substring(1, 3).compareTo(c.getID()) == 0) {
					this.destination = c;
					break;
				}
			}
		}
		else {
			this.destination = C.get(0);
			this.minutes = (long)Math.ceil((double)this.minutes / 3);
		}
	}
	
	public void calPrice(){
		this.Price = this.minutes * this.destination.getPrice();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %d %d", this.receiver, this.destination.getName(), this.minutes, this.Price);
	}
	
}
