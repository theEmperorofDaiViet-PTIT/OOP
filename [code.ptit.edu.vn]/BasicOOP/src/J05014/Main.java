package J05014;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Candidate> Can = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Can.add(new Candidate(i, input.nextLine(), input.nextLine(),
					input.nextLine(), input.nextLine()));
		}
		Collections.sort(Can);
		for(Candidate mem: Can) {
			System.out.print(mem.toString());
		}
		input.close();
	}

}
