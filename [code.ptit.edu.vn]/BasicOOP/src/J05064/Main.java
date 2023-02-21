package J05064;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Teacher> T = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			T.add(new Teacher());
			input.nextLine();
			T.get(i).code = input.nextLine();
			T.get(i).getRole();
			T.get(i).getIndex();
			T.get(i).name = input.nextLine();
			T.get(i).rawSalary = input.nextInt();
			T.get(i).getBonus();
			T.get(i).getIncome();
		}
		int countHT = 0;
		int countHP = 0;
		for(Teacher Tea: T) {
			if(Tea.role.compareTo("HT") == 0) {
				countHT++;
				if(countHT > 1)
					continue;
			}
			if(Tea.role.compareTo("HP") == 0) {
				countHP++;
				if(countHP > 2)
					continue;
			}
			System.out.printf("%s %s %d %d %d\n", Tea.code, Tea.name, Tea.index, Tea.bonus, Tea.income);
			input.close();
		}
	}

}
