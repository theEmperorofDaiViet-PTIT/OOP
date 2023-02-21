package J05017;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Client> Cli = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Cli.add(new Client(i, input.nextLine(), input.nextLine(), input.nextLine()));
			
		}
		Collections.sort(Cli);
		for(Client mem: Cli) {
			System.out.print(mem.toString());
		}
		input.close();
	}

}
