package J05022;
import java.util.*;
public class Student {
	String ID;
	String name;
	String Class;
	String email;
	
	public static void query(ArrayList<Student> Stu, String Class) {
		System.out.println("DANH SACH SINH VIEN LOP " + Class + ":");
		for(Student mem: Stu) {
			if(mem.Class.compareTo(Class) == 0) {
				System.out.printf("%s %s %s %s\n", mem.ID, mem.name, mem.Class, mem.email);
			}
		}
	}
}
