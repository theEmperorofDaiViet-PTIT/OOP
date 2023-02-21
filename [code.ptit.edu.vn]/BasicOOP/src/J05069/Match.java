package J05069;
import java.util.*;
public class Match {
	private String ID;
	private FootballClub FC;
	private int attendance;
	private long income;
	
	Match(String ID, int attendance){
		this.ID = ID;
		this.attendance = attendance;

	}
	
	public void setClub(ArrayList<FootballClub> FCs) {
		for(FootballClub mem: FCs) {
			if(this.ID.substring(1,3).compareTo(mem.getID()) == 0) {
				this.FC = mem;
				break;
			}
		}
	}
	
	public void calIncome() {
		this.income = this.FC.getPrice() * this.attendance;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %d\n", this.ID, this.FC.getName(), this.income);
	}
}
