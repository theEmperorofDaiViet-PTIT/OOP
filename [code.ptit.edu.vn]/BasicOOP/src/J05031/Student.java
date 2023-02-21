package J05031;

public class Student implements Comparable<Student>{
	String ID;
	String name;
	String Class;
	double score1;
	double score2;
	double score3;
	
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