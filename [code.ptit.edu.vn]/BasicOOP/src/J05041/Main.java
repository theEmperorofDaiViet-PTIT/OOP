package J05041;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Staff> St = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			St.add(new Staff());
			St.get(i).getID(i+1);
			St.get(i).name = input.nextLine();
			St.get(i).wage = input.nextLong();
			St.get(i).days = input.nextInt();
			St.get(i).getSalary();
			St.get(i).getReward();
			input.nextLine();
			St.get(i).role = input.nextLine();
			St.get(i).getBonus();
			St.get(i).getPayment();
		}
		Collections.sort(St);
		for(Staff mem: St) {
			System.out.printf("%s %s %d %d %d %d\n", mem.ID, mem.name, mem.salary,
					mem.reward, mem.bonus, mem.payment);
		}
		input.close();
	}

}