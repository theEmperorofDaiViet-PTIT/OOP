package J05081;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Merchandise> Mer = new ArrayList<>();
		int amount = input.nextInt();
		for(int i = 0; i < amount; i++) {
			Mer.add(new Merchandise());
			input.nextLine();
			Mer.get(i).getID(i+1);
			Mer.get(i).name = input.nextLine();
			Mer.get(i).unit = input.nextLine();
			Mer.get(i).buyPrice = input.nextInt();
			Mer.get(i).sellPrice = input.nextInt();
			Mer.get(i).getProfit();
		}
		Collections.sort(Mer);
		for(int i = 0; i < amount; i++) {
			System.out.printf("%s %s %s %d %d %d\n", Mer.get(i).mID, Mer.get(i).name,
					Mer.get(i).unit, Mer.get(i).buyPrice, Mer.get(i).sellPrice, Mer.get(i).profit);
		}
		input.close();
	}

}
