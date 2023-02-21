package J05065;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Staff> GD = new ArrayList<>();
		ArrayList<Staff> TP =  new ArrayList<>();
		ArrayList<Staff> PP =  new ArrayList<>();
		ArrayList<Staff> NV =  new ArrayList<>();

		
		for(int i = 0; i < amount; i++) {
			Staff s = new Staff(input.next(), input.nextLine());
			if(s.getID().compareTo("GD") == 0) {
				if(GD.size() < 1)
					GD.add(s);
				else {
					s.fixID();
					NV.add(s);
				}
			}
			else if(s.getID().compareTo("TP") == 0) {
				if(TP.size() < 3)
					TP.add(s);
				else {
					s.fixID();
					NV.add(s);
				}
			}
			else if(s.getID().compareTo("PP") == 0) {
				if(PP.size() < 3)
					PP.add(s);
				else {
					s.fixID();
					NV.add(s);
				}
			}
			else {
				NV.add(s);
			}
		}
		Collections.sort(TP);
		Collections.sort(PP);
		Collections.sort(NV);
		Map<String, ArrayList<Staff>> m = new HashMap<>();
		m.put("GD", GD);
		m.put("TP", TP);
		m.put("PP", PP);
		m.put("NV", NV);
		
		int amountQuery = input.nextInt();
		for(int i = 0; i < amountQuery; i++) {
			String query = input.next();
			for(String role : m.keySet()) {
				if(query.compareTo(role) == 0) {
					for(Staff s: m.get(role)) {
						System.out.print(s.toString());				
					}
					System.out.println();
				}
			}
		}
		
		input.close();
	}

}


