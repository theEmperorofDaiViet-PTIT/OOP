package J06004;

public class Student {
	
	String ID;
	String name;
	String tel;
	int groupName;
	Group g;
	
	public void joinGroup(Group g) {
		if(this.groupName == g.groupName) {
			this.g = g;
		}
	}
	
	public static void sortByID(Student[] stu) {
		for(int i = 1; i < stu.length; i++) {
			Student tmp = stu[i];
			int j;
			for(j = i - 1; j >= 0; j--) {	
				if(stu[j].ID.compareTo(tmp.ID) > 0)
					stu[j + 1] = stu[j];
				else
					break;			
			}
			stu[j+1] = tmp;
		}
	}
}
