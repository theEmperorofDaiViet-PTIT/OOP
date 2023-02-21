package J07010;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("SV.in"));
		int n = input.nextInt();
		ArrayList<Student> Stu = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			Stu.add(new Student());
			Stu.get(i).getID(i + 1);
			input.nextLine();
			Stu.get(i).name = input.nextLine();
			Stu.get(i).Class = input.nextLine();
			Stu.get(i).dob = input.nextLine();
			Stu.get(i).getDOB();
			Stu.get(i).GPA = input.nextDouble();		
			
		}
		for(int i = 0; i < n; i++) {
			System.out.printf("%s %s %s %s %.2f\n", Stu.get(i).ID, Stu.get(i).name, Stu.get(i).Class
					, Stu.get(i).DOB, Stu.get(i).GPA);
		}

	}

}
