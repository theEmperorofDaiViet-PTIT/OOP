package J05061;

import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Candidate> Can = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Can.add(new Candidate());
			Can.get(i).getID(i+1);
			input.nextLine();
			Can.get(i).getName(input.nextLine());
			Can.get(i).getDoB(input.nextLine());
			Can.get(i).getAge();
			Can.get(i).test1 = input.nextDouble();
			Can.get(i).test2= input.nextDouble();
			Can.get(i).getBonus();
			Can.get(i).getTotal();
			Can.get(i).getTier();
		}
		Collections.sort(Can);
		for(Candidate mem: Can) {
			System.out.printf("%s %s %d %.0f %s\n", mem.ID, mem.name, mem.age, mem.total, mem.tier);
		}
		
		input.close();
	}

}