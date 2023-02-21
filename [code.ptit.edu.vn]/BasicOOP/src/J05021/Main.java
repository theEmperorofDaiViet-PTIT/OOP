package J05021;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		ArrayList<Student> Stu = new ArrayList<>();
		int i = 0;
		while(input.hasNext()) {
			Stu.add(new Student());
			Stu.get(i).ID = input.nextLine();
			Stu.get(i).name = input.nextLine();
			Stu.get(i).Class = input.nextLine();
			Stu.get(i).email = input.nextLine();
			i++;
		}
		Collections.sort(Stu);
		for(int j = 0; j < i; j++) {
			System.out.printf("%s %s %s %s\n", Stu.get(j).ID, Stu.get(j).name, Stu.get(j).Class, Stu.get(j).email);
		}
	}

}
