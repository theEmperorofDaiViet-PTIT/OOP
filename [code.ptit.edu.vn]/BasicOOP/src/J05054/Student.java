package J05054;
import java.util.*;
public class Student implements Comparable<Student>{
	String ID = "HS";
	String name;
	double GPA;
	String tier;
	int ranking;
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}
	
	
	public void getTier() {
		if(this.GPA >= 9)
			this.tier = "Gioi";
		else if(this.GPA >= 7)
			this.tier = "Kha";
		else if(this.GPA >= 5)
			this.tier = "Trung Binh";
		else
			this.tier = "Yeu";
	}
	
	@Override
	public int compareTo(Student s) {
		if(this.GPA < s.GPA)
			return 1;
		else if(this.GPA == s.GPA)
			return 0;
		else
			return -1;
	}
	
	public static void setRanking(ArrayList<Student> Stu2) {
		 for(int i = 0; i < Stu2.size(); i++) {
			if(i == 0) 
				Stu2.get(i).ranking = 1;
			else{				
				if(Stu2.get(i).GPA != Stu2.get(i-1).GPA) {
					 Stu2.get(i).ranking = i + 1;
				}
				else {
					 Stu2.get(i).ranking = Stu2.get(i-1).ranking;
				}
			}		 	 
		 }
	}
	
	
	public void getRanking(ArrayList<Student> Stu2) {
		for(int i = 0; i < Stu2.size(); i++) {
			if(this.ID.compareTo(Stu2.get(i).ID) == 0) {
				this.ranking = Stu2.get(i).ranking;
				return;
			}
		}
	}
}
