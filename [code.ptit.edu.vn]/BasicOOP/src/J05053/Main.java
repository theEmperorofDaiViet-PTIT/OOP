package J05053;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Bill> Bi = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Bi.add(new Bill());
			input.nextLine();
			Bi.get(i).name = input.nextLine();
			Bi.get(i).ID = input.nextLine();
			Bi.get(i).price = input.nextLong();
			Bi.get(i).amount = input.nextInt();
			Bi.get(i).getOrder();
			Bi.get(i).getDiscount();
			Bi.get(i).getTotalPrice();
			Bi.get(i).getDiscount();
			Bi.get(i).getPayment();
		}
		Collections.sort(Bi);
		for(Bill mem: Bi) {
			System.out.printf("%s %s %s %d %d\n", mem.name, mem.ID, mem.order, mem.discount, mem.payment);
		}
		input.close();
	}

}