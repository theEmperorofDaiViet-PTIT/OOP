package J05021;

public class Student implements Comparable<Student>{
	String ID;
	String name;
	String Class;
	String email;
	
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
