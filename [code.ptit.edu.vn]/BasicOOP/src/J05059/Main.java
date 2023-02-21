package J05059;
import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Candidate> Can = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Can.add(new Candidate());
			input.nextLine();
			Can.get(i).ID = input.nextLine();
			Can.get(i).getName(input.nextLine());
			Can.get(i).getBonus();
			Can.get(i).Mat = input.nextDouble();
			Can.get(i).Phy = input.nextDouble();
			Can.get(i).Che = input.nextDouble();
			Can.get(i).getTotal();
		}
		int target = input.nextInt();
		double targetPoint = 0;
		Collections.sort(Can);
		for(int i = 0; i < target && i < Can.size(); i++) {
			Can.get(i).result = "TRUNG TUYEN";
			targetPoint = Can.get(i).total;
			if(i == target - 1 && i < Can.size()) {
				if(Can.get(i).total == Can.get(i+1).total) {
					target++;
				}
			}
		}
		
		for(int i = target; i < amount; i++) {
			Can.get(i).result = "TRUOT";
		}

		System.out.printf("%.1f\n", targetPoint);
		for(Candidate mem: Can) {
			System.out.printf("%s %s ", mem.ID, mem.name);
			if(mem.bonus == (int)mem.bonus)
				System.out.print((int)mem.bonus + " ");
			else
				System.out.printf("%.1f ", mem.bonus);
			if(mem.total == (int)mem.total)
				System.out.print((int)mem.total + " ");
			else
				System.out.printf("%.1f ", mem.total);
			System.out.println(mem.result);
		}
		input.close();
	}

}