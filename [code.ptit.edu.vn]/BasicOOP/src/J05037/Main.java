package J05037;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Merchandise> Mer = new ArrayList<>();
		for(int i  = 0; i < amount; i++) {
			Mer.add(new Merchandise());
			input.nextLine();
			Mer.get(i).name = input.nextLine();
			Mer.get(i).getID(i+1);
			Mer.get(i).unit = input.nextLine();
			Mer.get(i).buyPrice = input.nextLong();
			Mer.get(i).amount = input.nextInt();
			Mer.get(i).getShip();
			Mer.get(i).getTotalPrice();
			Mer.get(i).getSellPrice();
		}
		Collections.sort(Mer);
		for(Merchandise mem: Mer) {
			System.out.printf("%s %s %s %.0f %.0f %.0f\n", mem.ID, mem.name, mem.unit, mem.ship, mem.totalPrice, mem.sellPrice);
		}
		input.close();
	}

}