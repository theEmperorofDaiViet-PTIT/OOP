package J05054;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Student> Stu = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Stu.add(new Student());
			Stu.get(i).getID(i+1);
			input.nextLine();
			Stu.get(i).name = input.nextLine();
			Stu.get(i).GPA = input.nextDouble();
			Stu.get(i).getTier();
		}
		ArrayList<Student> Stu2 = new ArrayList<>(Stu);
		Collections.sort(Stu2);
		Student.setRanking(Stu2);
		for(Student mem: Stu) {
			mem.getRanking(Stu2);
		}
		for(Student mem: Stu) {
			System.out.printf("%s %s %.1f %s %d\n", mem.ID, mem.name, mem.GPA, mem.tier, mem.ranking);
		}
		input.close();
	}

}

