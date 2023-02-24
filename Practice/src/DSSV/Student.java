package DSSV;

public class Student implements Comparable<Student>{
	
	String ID;
	String name = "";
	String Class;
	String email;
	
		
	
	public void getName(String s) {
		s = s.toLowerCase();
		String[] Str = s.split(" ");
		for(int i = 0; i < Str.length; i++) {
			if(Str[i].length() > 0)
				name += Str[i].substring(0, 1).toUpperCase() + Str[i].substring(1) + " ";
		}
		name = name.trim();
	}
	
	@Override
	public int compareTo(Student s) {
		if(this.ID.compareTo(s.ID) < 0)
			return -1;
		else if(this.ID.compareTo(s.ID) == 0)
			return 0;
		else
			return 1;
	}
	
}
