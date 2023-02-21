package J05016a;

import java.text.ParseException;
import java.util.*;
public class Main {

	public static void main(String[] args) throws ParseException{
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Guest> G = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			input.nextLine();
			G.add(new Guest(input.nextLine(), i+1, input.nextLine(), input.nextLine(), input.nextLine(), input.nextInt()));
		}
		Collections.sort(G);
		for(Guest g: G) {
			System.out.print(g.toString());
		}
		input.close();
	}

}
