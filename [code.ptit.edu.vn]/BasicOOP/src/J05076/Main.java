package J05076;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountMer = input.nextInt();
		input.nextLine();
		ArrayList<Merchandise> Mer = new ArrayList<>();
		for(int i = 0; i < amountMer; i++) {
			Mer.add(new Merchandise(input.nextLine(),input.nextLine(),input.nextLine()));
		}
		int amountBill = input.nextInt();
		ArrayList<Bill> Bil = new ArrayList<>();
		for(int i = 0; i < amountBill; i++) {
			Bil.add(new Bill(input.next(), input.nextLong(),input.nextLong(),input.nextLong()));
			Bil.get(i).setMerchandise(Mer);
			Bil.get(i).calSellPrice();
			Bil.get(i).calTotalSell();
		}
		for(Bill mem: Bil) {
			System.out.print(mem.toString());
		}
		input.close();
	}

}
