package J05019;
import java.util.*;
import java.text.ParseException;
public class Main {

	public static void main(String[] args) throws ParseException{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		ArrayList<Station> Sta = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < n; i++) {
			boolean checkExisted = false;
			String name = input.nextLine();
			String start = input.nextLine();
			String end = input.nextLine();
			String amount = input.nextLine();
			for(Station mem: Sta) {
				if(name.compareTo(mem.getName()) == 0) {
					checkExisted = true;
					mem.addTime(start, end);
					mem.addAmount(Integer.parseInt(amount));
					break;
				}
			}
			if(checkExisted == false) {
				count++;
				Sta.add(new Station(count, name));
				Sta.get(count - 1).addTime(start, end);
				Sta.get(count - 1).addAmount(Integer.parseInt(amount));
			}
		}
		for(Station mem: Sta) {
			mem.calAverage();
			System.out.print(mem.toString());
		}
		
		input.close();
	}

}




