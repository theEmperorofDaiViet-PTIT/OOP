package J05047;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Merchandise> Mer = new ArrayList<>();
		Map<String,Integer> Putin = new HashMap<>();
		for(int i = 0; i < amount; i++) {
			Mer.add(new Merchandise());
			input.nextLine();
			Mer.get(i).name = input.nextLine();
			Mer.get(i).getID();
			Mer.get(i).getIndex(Putin);
			Mer.get(i).amount = input.nextLong();
			Mer.get(i).price = input.nextLong();
			Mer.get(i).getDiscount();
			Mer.get(i).getPayment();
		}
		Collections.sort(Mer);
		for(Merchandise mem: Mer) {
			System.out.printf("%s %s %.0f %.0f\n", mem.ID, mem.name, mem.discount, mem.payment);
		}
		
		input.close();
	}

}