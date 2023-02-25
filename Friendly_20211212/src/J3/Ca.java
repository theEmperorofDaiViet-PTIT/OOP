package J3;

import java.util.Calendar;
public class Ca implements Comparable<Ca>{
	private String ID;
	private String DMY;
	private String HM;
	private Calendar time = Calendar.getInstance();
	private String room;
	
	Ca(int i, String DMY, String HM, String room){
		this.setID(i);
		this.DMY = DMY;
		this.HM = HM;
		this.room = room;
		this.setTime();
	}
	
	public String getID() {
		return this.ID;
	}
	
	private void setID(int i) {
		this.ID = "C" + String.format("%03d", i);
	}
	
	public String getDMY() {
		return this.DMY;
	}
	
	public String getHM() {
		return this.HM;
	}
	
	public String getRoom() {
		return this.room;
	}
	
	public Calendar getTime() {
		return this.time;
	}
	
	public void setTime() {
		String[] dmy = DMY.split("/");
		int date = Integer.parseInt(dmy[0]);
		int month = Integer.parseInt(dmy[1]);
		int year = Integer.parseInt(dmy[2]);
		
		String[] hm = HM.split(":");
		int hour = Integer.parseInt(hm[0]);
		int min = Integer.parseInt(hm[1]);
		
		this.time.set(year, month, date, hour, min);
	}
	
	@Override
	public int compareTo(Ca c){
		if(this.time.compareTo(c.time) < 0)
			return -1;
		else if(this.time.compareTo(c.time) == 0) {
			if(this.ID.compareTo(c.ID) < 0)
				return -1;
			else
				return 1;
		}
		else	
			return 1;
		
	}

}