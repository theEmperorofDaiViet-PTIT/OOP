package J06003;

public class Group {
	int groupName;
	int maxSize;
	Student[] stu = new Student[100];
	int currentSize = 0;
	String subject;
	
	Group(){
	}
	Group(int maxSize) {
		this.maxSize = maxSize;
	}
	
	
}
