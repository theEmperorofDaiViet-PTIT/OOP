package J05009;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Candidate> Can = new ArrayList<>();
		int amount = input.nextInt();
		input.nextLine();
		for(int i = 0; i < amount; i++) {
			Can.add(new Candidate(i+1,input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()));
		}
		input.close();
		Collections.sort(Can);
		for(int i = 0; i < amount; i++) {
			System.out.println(Can.get(i).toString());
			if(Can.get(i).getTotalScore() > Can.get(i+1).getTotalScore())
				break;
		}
	}

}
