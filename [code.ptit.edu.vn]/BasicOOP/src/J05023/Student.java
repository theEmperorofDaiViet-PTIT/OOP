package J05023;

import java.util.ArrayList;

public class Student{
	String ID;
	String name;
	String Class;
	String email;
	String year = "";
	
	public void getYear() {
		this.year += this.Class.substring(1,3);
	}
	
	public static void query(ArrayList<Student> Stu, String year) {
		System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
		for(Student mem: Stu) {
			if(mem.year.compareTo(year.substring(2)) == 0) {
				System.out.printf("%s %s %s %s\n", mem.ID, mem.name, mem.Class, mem.email);
			}
		}
	}
}