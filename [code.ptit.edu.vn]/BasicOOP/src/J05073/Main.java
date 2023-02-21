package J05073;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Merchandise> Mer = new ArrayList<>();
		for(int i = 0; i < amount ; i++) {
			Mer.add(new Merchandise(input.next(), input.nextLong(), input.nextLong()));
		}
		for(Merchandise m: Mer) {
			System.out.print(m.toString());
		}
		input.close();
	}

}
