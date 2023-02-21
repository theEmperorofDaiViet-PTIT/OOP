package J05075;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Student> Stu = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Stu.add(new Student(input.nextLine(), input.nextLine(), input.nextLine()));
		}
		for(int i = 0; i < amount; i++) {
			String ID = input.next();
			for(Student mem: Stu) {
				if(ID.compareTo(mem.getID()) == 0) {
					mem.setRecord(input.next());
					mem.calScore();
					mem.calResult();
					break;
				}
			}
		}
		String Class = input.next();
		for(Student mem: Stu) {
			if(mem.getClasses().compareTo(Class) == 0)
				System.out.print(mem.toString());
		}
		input.close();
	}

}

