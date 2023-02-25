package Tinhtienphong;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("KHACHHANG.in"));
		int amount = input.nextInt();
		ArrayList<Guest> G = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			G.add(new Guest());
			input.nextLine();
			G.get(i).getID(i+1);
			G.get(i).getName(input.nextLine());
			G.get(i).room = input.nextLine();
			G.get(i).getPricePerDay();
			G.get(i).formatDayIn(input.nextLine());
			G.get(i).formatDayOut(input.nextLine());
			G.get(i).calculateDate();
			G.get(i).fee = input.nextInt();
			G.get(i).getTotalPrice();
			
		}
		Collections.sort(G);
		for(Guest mem: G) {
			System.out.printf("%s %s %s %d %d\n", mem.ID, mem.name, mem.room, mem.days, mem.totalPrice);
		}
		input.close();
	}

}
