package J06003;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountStu = input.nextInt();
		int amountGroup = input.nextInt();
		Group[] G = new Group[amountGroup];
		for(int i = 0; i < amountGroup; i++) {
			G[i] = new Group(amountStu);
			G[i].groupName = i + 1;
		}
		for(int i = 0; i < amountStu; i++) {
			Student s = new Student();
			input.nextLine();
			s.ID = input.nextLine();
			s.name = input.nextLine();
			s.tel = input.nextLine();
			s.groupName = input.nextInt();
			for(int j = 0; j < amountGroup; j++) {
				if(G[j].groupName == s.groupName)
					s.addStudent(G[j]);
			}
		}
		input.nextLine();
		for(int i = 0; i < amountGroup; i++) {
			G[i].subject = input.nextLine();
		}
		int Queries = input.nextInt();
		for(int i = 0; i < Queries; i++) {
			int g = input.nextInt();
			for(int j = 0; j < amountGroup; j++) {
				if(G[j].groupName == g) {
					System.out.println("DANH SACH NHOM " + G[j].groupName + ":");
					for(int k = 0; k < G[j].currentSize; k++) {
						System.out.printf("%s %s %s", G[j].stu[k].ID, G[j].stu[k].name, G[j].stu[k].tel);
						System.out.println();
					}
					System.out.println("Bai tap dang ky: " + G[j].subject);
				}
			}
		}		
		input.close();
	}

}
