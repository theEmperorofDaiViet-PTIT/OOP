package J05055;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Athlete> ATL = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			ATL.add(new Athlete(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), i+1));
		}
		
		ArrayList<Athlete> ATL2 = (ArrayList) ATL.clone();
		Collections.sort(ATL2);
		ATL2.get(0).setRank(1);
		for(int i = 1; i < ATL2.size(); i++) {
			if(ATL2.get(i).compareTo(ATL2.get(i-1)) == 0) {
				ATL2.get(i).setRank(ATL2.get(i-1).getRank());
			}
			else {
				 ATL2.get(i).setRank(i+1);
			}
		}
		for(Athlete a: ATL) {
			System.out.println(a.toString());
		}
		input.close();
	}

}

