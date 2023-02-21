package J05031;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountStudent = input.nextInt();
		ArrayList<Student> Stu = new ArrayList<>();
		for(int i = 0; i < amountStudent; i++) {
			Stu.add(new Student());
			input.nextLine();
			Stu.get(i).ID = input.nextLine();
			Stu.get(i).name = input.nextLine();
			Stu.get(i).Class = input.nextLine();
			Stu.get(i).score1 = input.nextDouble();
			Stu.get(i).score2 = input.nextDouble();
			Stu.get(i).score3 = input.nextDouble();
		}
		Collections.sort(Stu);
		int i = 1;
		for(Student mem: Stu) {
			System.out.printf("%d %s %s %s %.1f %.1f %.1f\n", i, mem.ID, mem.name, mem.Class, mem.score1,
					mem.score2, mem.score3);
			i++;
		}
		
		input.close();
	}

}
