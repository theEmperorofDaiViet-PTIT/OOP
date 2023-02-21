package J05051;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Client> Cl = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Cl.add(new Client());
			Cl.get(i).getID(i+1);
			Cl.get(i).type = input.next();
			Cl.get(i).oldIndex = input.nextInt();
			Cl.get(i).newIndex = input.nextInt();
			Cl.get(i).getX();
			Cl.get(i).getPrice();
			Cl.get(i).getBonus();
			Cl.get(i).getPayment();
		}
		Collections.sort(Cl);
		for(Client mem: Cl) {
			System.out.printf("%s %d %d %.0f %.0f\n", mem.ID, mem.X, mem.Price, mem.bonus, mem.payment);
		}
		
		input.close();
	}

}
