package J05072;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountCity = input.nextInt();		
		ArrayList<City> C = new ArrayList<>();
		C.add(new City("", "Noi mang", 800));
		for(int i = 1; i <= amountCity; i++) {
			input.nextLine();
			C.add(new City(input.nextLine(), input.nextLine(), input.nextLong()));
		}
		int amountCall = input.nextInt();
		ArrayList<Call> Cc = new ArrayList<>();
		for(int i = 0; i < amountCall; i++) {
			Cc.add(new Call(input.next(), input.next(), input.next()));
			Cc.get(i).checkDiscount(C);
			Cc.get(i).calPrice();
		}
		Collections.sort(Cc);
		for(Call c: Cc) {
			System.out.println(c.toString());
		}
		input.close();
	}

}
