package J05024;

import java.util.*;

public class Student {
	String ID;
	String name;
	String Class;
	String email;
	String major;
	
	public void getMajor() {
		this.major = this.ID.substring(3,7);
	}
	
	public static void query(ArrayList<Student> Stu, Map<String,String> Major, ArrayList<String> blackList, String major) {
		System.out.println("DANH SACH SINH VIEN NGANH " + major.toUpperCase() + ":");
		for(Student mem: Stu) {
			if(mem.major.compareTo(Major.get(major)) == 0) {
				if(blackList.contains(mem.major) && mem.Class.substring(0,1).compareTo("E") == 0)
					continue;
				System.out.printf("%s %s %s %s\n", mem.ID, mem.name, mem.Class, mem.email);
			}
		}
	}
}
