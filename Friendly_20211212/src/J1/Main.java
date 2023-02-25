package J1;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("MONHOC.in"));
		ArrayList<Subject> Sub = new ArrayList<>();
		int amount = input.nextInt();
		input.nextLine();
		for(int i = 0; i < amount; i++) {
			Sub.add(new Subject(input.nextLine(), input.nextLine(), input.nextLine()));
		}
		Collections.sort(Sub);
		for(Subject mem: Sub) {
			System.out.print(mem.toString());
		}
	}

}
