package J05027;

import java.util.*;
public class Professor {
	String ID = "GV";
	String name;
	String forename;
	String major;
	String majorID = "";
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}
	
	public void getMajorID() {
		String[] tmp = this.major.split(" ");
		for(String mem: tmp) {
			majorID += mem.substring(0,1).toUpperCase();
		}
	}
	
	public static void query(ArrayList<Professor> Prof, String key) {
		System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + key + ":");
		for(Professor mem: Prof) {
			if(mem.name.toLowerCase().contains(key.toLowerCase())) {
				System.out.printf("%s %s %s\n", mem.ID, mem.name, mem.majorID);
			}
		}
	}
}
