package J06004;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountStu = input.nextInt();
		int amountGroup = input.nextInt();
		Group[] G = new Group[amountGroup];
		Student[] stu = new Student[amountStu];
		for(int i = 0; i < amountGroup; i++) {
			G[i] = new Group();
			G[i].groupName = i + 1;
		}
		for(int i = 0; i < amountStu; i++) {
			stu[i] = new Student();
			input.nextLine();
			stu[i].ID = input.nextLine();
			stu[i].name = input.nextLine();
			stu[i].tel = input.nextLine();
			stu[i].groupName = input.nextInt();
			for(int j = 0; j < amountGroup; j++) {
				if(G[j].groupName == stu[i].groupName)
					stu[i].joinGroup(G[j]);
			}
		}
		input.nextLine();
		for(int i = 0; i < amountGroup; i++) {
			G[i].subject = input.nextLine();
		}
		Student.sortByID(stu);
		for(int i = 0; i < amountStu; i++) {
			System.out.printf("%s %s %s %d %s", stu[i].ID, stu[i].name, stu[i].tel, stu[i].groupName, stu[i].g.subject);
			System.out.println();
		}
		input.close();

	}

}
