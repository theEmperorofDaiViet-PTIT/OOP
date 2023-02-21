package J05022;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Student> Stu = new ArrayList<>();
		for(int i = 0; i < amount; i++){
			Stu.add(new Student());
			Stu.get(i).ID = input.nextLine();
			Stu.get(i).name = input.nextLine();
			Stu.get(i).Class = input.nextLine();
			Stu.get(i).email = input.nextLine();
		}
		int amountQuery = input.nextInt();
		input.nextLine();
		for(int i = 0; i < amountQuery; i++) {
			Student.query(Stu, input.nextLine());
		}
		input.close();
	}

}
