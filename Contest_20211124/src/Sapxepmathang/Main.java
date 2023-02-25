package Sapxepmathang;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("MATHANG.in"));
		int amount = input.nextInt();
		ArrayList<Merchandise> Mer = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Mer.add(new Merchandise());
			Mer.get(i).getID(i+1);
			input.nextLine();
			Mer.get(i).name = input.nextLine();
			Mer.get(i).category = input.nextLine();
			Mer.get(i).buyPrice = input.nextDouble();
			Mer.get(i).sellPrice = input.nextDouble();
			Mer.get(i).getProfit();
		}
		Collections.sort(Mer);
		for(Merchandise mem: Mer) {
			System.out.printf("%s %s %s %.2f\n", mem.ID, mem.name, mem.category, mem.profit);
		}
		input.close();
	}

}
