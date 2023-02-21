package J05026;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Professor> Prof = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Prof.add(new Professor());
			Prof.get(i).getID(i+1);
			Prof.get(i).name = input.nextLine();
			Prof.get(i).major = input.nextLine();
			Prof.get(i).getMajorID();
		}
		int amountQuery = input.nextInt();
		input.nextLine();
		for(int i = 0; i < amountQuery; i++) {			
			Professor.query(Prof, Professor.getQueryMajorID(input.nextLine()));
		}
	
		
		
		input.close();

	}

}
