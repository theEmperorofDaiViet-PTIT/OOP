package J05049;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Merchandise> Mer = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Mer.add(new Merchandise());
			input.nextLine();			
			Mer.get(i).ID = input.nextLine();
			Mer.get(i).amountImport = input.nextDouble();
			Mer.get(i).getAmountExport();
			Mer.get(i).getPrice();
			Mer.get(i).getTotalPrice();
			Mer.get(i).getTax();
		}
	
		input.nextLine();
		String query = input.nextLine();
		ArrayList<Merchandise> Query = new ArrayList<>();
		for(Merchandise mem: Mer) {
			if(mem.ID.substring(0,1).compareTo(query) == 0) {
				Query.add(mem);
			}
		}
		Collections.sort(Query);
		for(Merchandise mem: Query) {
			System.out.printf("%s %.0f %.0f %.0f %.0f %.0f\n", mem.ID, mem.amountImport, mem.amountExport,
					mem.price, mem.totalPrice, mem.tax);
		}
		input.close();
	}

}
