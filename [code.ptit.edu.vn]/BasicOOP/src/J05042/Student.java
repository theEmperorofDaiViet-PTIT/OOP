package J05042;

public class Student implements Comparable<Student>{
	private String name;
	private int correct;
	private int submited;
	Student(String line1, String line2){
		this.name = line1;
		this.correct = Integer.parseInt(line2.split(" ")[0]);
		this.submited = Integer.parseInt(line2.split(" ")[1]);
	}
	
	@Override
	public int compareTo(Student s) {
		if(this.correct < s.correct)
			return 1;
		else if(this.correct == s.correct) {
			if(this.submited < s.submited)
				return -1;
			else if(this.submited == s.submited) {
				if(this.name.compareTo(s.name) < 0)
					return -1;
				else if(this.name.compareTo(s.name) == 0)
					return 0;
				else
					return 1;
			}
			else
				return 1;
		}
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.correct + " " + this.submited;
	}
}
