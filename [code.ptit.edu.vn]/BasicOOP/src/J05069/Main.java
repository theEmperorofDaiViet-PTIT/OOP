package J05069;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountClub = input.nextInt();
		ArrayList<FootballClub> FCs = new ArrayList<>();
		for(int i = 0; i < amountClub; i++) {
			input.nextLine();
			FCs.add(new FootballClub(input.nextLine(), input.nextLine(), input.nextInt()));
		}
		int amountMatch = input.nextInt();
		ArrayList<Match> Mat = new ArrayList<>();
		for(int i = 0; i < amountMatch; i++){
			Mat.add(new Match(input.next(), input.nextInt()));
			Mat.get(i).setClub(FCs);
			Mat.get(i).calIncome();
		}
		input.close();
		
		for(Match mem: Mat) {
			System.out.print(mem.toString());
		}
	}

}
