package J05042;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Student> Stu = new ArrayList<>();
		int amount = input.nextInt();
		input.nextLine();
		for(int i = 0; i < amount; i++) {
			Stu.add(new Student(input.nextLine(), input.nextLine()));
		}
		Collections.sort(Stu);
		for(Student mem: Stu) {
			System.out.println(mem.toString());
		}
		input.close();
	}
}
