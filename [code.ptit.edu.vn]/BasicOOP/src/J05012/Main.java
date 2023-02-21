package J05012;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Bill> Bil = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Bil.add(new Bill(input.nextLine(), input.nextLine(), input.nextLine(),
					input.nextLine(), input.nextLine()));
			Bil.get(i).calPayment();
		}
		Collections.sort(Bil);
		for(Bill mem: Bil) {
			System.out.print(mem.toString());
		}
		
		input.close();
	}

}
