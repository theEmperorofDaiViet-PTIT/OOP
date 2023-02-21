package J05035;

public class Student implements Comparable<Student>{
	int Order;
	String ID;
	String name;
	String Class;
	String email;
	String Corp;
	
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
