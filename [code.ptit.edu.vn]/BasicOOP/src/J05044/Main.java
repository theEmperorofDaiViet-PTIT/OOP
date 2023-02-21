package J05044;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Integer> roleBonus = new HashMap<>();
		roleBonus.put("GD", 500);
		roleBonus.put("PGD", 400);
		roleBonus.put("TP", 300);
		roleBonus.put("KT", 250);
		int amount = input.nextInt();
		ArrayList<Officer> Off = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Off.add(new Officer());
			Off.get(i).getID(i+1);
			input.nextLine();
			Off.get(i).name = input.nextLine();
			Off.get(i).role = input.nextLine();
			Off.get(i).basicSalary = input.nextInt();
			Off.get(i).days = input.nextInt();
			Off.get(i).getSalary();
			Off.get(i).getBonus(roleBonus);
			Off.get(i).getAdvanced();
			Off.get(i).getRemain();
		}
		input.nextLine();
		String query = input.nextLine();
		for(Officer mem: Off) {
			if(mem.role.compareTo(query) == 0)
				System.out.printf("%s %s %d %d %.0f %.0f\n", mem.ID, mem.name, mem.bonus, mem.Salary, mem.advanced, mem.remain);
		}
		input.close();
	}
}
