package J05034;

public class Student implements Comparable<Student>{
	int Order;
	String ID;
	String name;
	String Class;
	String email;
	String Corp;
	
	@Override
	public int compareTo(Student s) {
		if(this.name.compareTo(s.name) < 0)
			return -1;
		else if(this.name.compareTo(s.name) == 0)
			return 0;
		else
			return 1;
	}
}
