package J06003;

public class Student {
	
	String ID;
	String name;
	String tel;
	int groupName;
	
	public void addStudent(Group g) {
		if(g.groupName == this.groupName) {
			g.stu[g.currentSize] = this;
			g.currentSize++;
		}
	}
}
