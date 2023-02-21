package J05066;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Staff> St = new ArrayList<>();
		ArrayList<Staff> GD = new ArrayList<>();
		ArrayList<Staff> TP =  new ArrayList<>();
		ArrayList<Staff> PP =  new ArrayList<>();
		ArrayList<Staff> NV =  new ArrayList<>();

		
		for(int i = 0; i < amount; i++) {
			Staff s = new Staff(input.next(), input.nextLine());
			if(s.getID().compareTo("GD") == 0) {
				if(s.getIDno() <= 1) {
					GD.add(s);
					St.add(s);
				}
				else {
					s.fixID();
					NV.add(s);
					St.add(s);
				}
			}
			else if(s.getID().compareTo("TP") == 0) {
				if(s.getIDno() <= 3) {
					TP.add(s);
					St.add(s);
				}
				else {
					s.fixID();
					NV.add(s);
					St.add(s);
				}
			}
			else if(s.getID().compareTo("PP") == 0) {
				if(s.getIDno() <= 3) {
					PP.add(s);
					St.add(s);
				}
				else {
					s.fixID();
					NV.add(s);
					St.add(s);
				}
			}
			else {
				NV.add(s);
				St.add(s);
			}
		}
		
		ArrayList<Staff> Query;
		int amountQuery = input.nextInt();
		input.nextLine();
		for(int i = 0; i < amountQuery; i++) {
			Query = new ArrayList<>();
			String query = input.nextLine();
			query = query.toLowerCase();
			for(Staff s: St) {
				if(s.getName().toLowerCase().contains(query)) {
					Query.add(s);
				}
			}
			Collections.sort(Query);
			for(Staff s: Query) {
				System.out.print(s.toString());
			}
			System.out.println();
		}
		
		input.close();

	}

}
