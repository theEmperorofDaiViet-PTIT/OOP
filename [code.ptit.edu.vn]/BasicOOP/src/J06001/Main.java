package J06001;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountMerchandise = input.nextInt();
		Merchandise[] Mer = new Merchandise[amountMerchandise];
		for(int i = 0; i < amountMerchandise; i++) {
			input.nextLine();
			Mer[i] = new Merchandise();
			Mer[i].ID = input.nextLine();
			Mer[i].name = input.nextLine();
			Mer[i].priceTier1 = input.nextLong();
			Mer[i].priceTier2 = input.nextLong();
		}
		int amountBill = input.nextInt();
		Bill[] Bil = new Bill[amountBill];
		for(int i = 0; i < amountBill; i++) {
			input.nextLine();
			Bil[i] = new Bill();
			Bil[i].ID = input.next();
			Bil[i].getID(i+1);
			Bil[i].addMerchandise(Mer);
			Bil[i].amount = input.nextInt();
			Bil[i].calculateBalance();
			Bil[i].calculateDiscount();
			Bil[i].calculateAfterDiscount();
		}
		for(int i = 0; i < amountBill; i++) {
			System.out.printf("%s %s %d %d", Bil[i].ID, Bil[i].m.name, Bil[i].discount, Bil[i].afterDiscount);
			System.out.println();
		}
		input.close();
	}

}
