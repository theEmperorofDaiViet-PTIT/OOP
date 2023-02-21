package J05026;
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
	
	public static String getQueryMajorID(String major) {
		String res = "";
		String[] tmp = major.split(" ");
		for(String mem: tmp) {
			res += mem.substring(0,1).toUpperCase();
		}
		return res;
	}
	
	public static void query(ArrayList<Professor> Prof, String major) {
		System.out.println("DANH SACH GIANG VIEN BO MON " + major + ":");
		for(Professor mem: Prof) {
			if(mem.majorID.compareTo(major) == 0) {
				System.out.printf("%s %s %s\n", mem.ID, mem.name, mem.majorID);
			}
		}
	}
}
