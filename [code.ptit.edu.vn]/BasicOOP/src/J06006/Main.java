package J06006;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountCustomer = input.nextInt();
		input.nextLine();
		Customer[] Cus = new Customer[amountCustomer];
		for(int i = 0; i < amountCustomer; i++) {
			Cus[i] = new Customer();
			Cus[i].ID += (i + 1);
			Cus[i].setID();
			Cus[i].name = input.nextLine();
			Cus[i].sex = input.nextLine();
			Cus[i].dob = input.nextLine();
			Cus[i].address = input.nextLine();
		}
		int amountMerchandise = input.nextInt();
		Merchandise[] Mer = new Merchandise[amountMerchandise];
		for(int i = 0; i < amountMerchandise; i++) {
			input.nextLine();
			Mer[i] = new Merchandise();
			Mer[i].ID += (i + 1);
			Mer[i].setID();
			Mer[i].name = input.nextLine();
			Mer[i].unit = input.nextLine();
			Mer[i].buyPrice = input.nextInt();
			Mer[i].sellPrice = input.nextInt();			
		}
		int amountBill = input.nextInt();
		Bill[] Bil = new Bill[amountBill];
		for(int i = 0; i < amountBill; i++) {
			input.nextLine();
			Bil[i] = new Bill();
			Bil[i].ID += (i + 1);
			Bil[i].setID();
			String cusID = input.next();
			for(int j = 0; j < amountCustomer; j++) {
				if(Cus[j].ID.compareTo(cusID) == 0) {
					Bil[i].setCustomer(Cus[j]);
					break;
				}
			}
			String merID = input.next();
			for(int j = 0; j < amountMerchandise; j++) {
				if(Mer[j].ID.compareTo(merID) == 0) {
					Bil[i].addMerchandise(Mer[j]);
					break;
				}
			}
			int amount = input.nextInt();
			Bil[i].addAmount(amount);
			Bil[i].calculateBalance();
			Bil[i].calculateProfit();
		}
		Bill.sortByProfit(Bil);
		for(int i = 0; i < amountBill; i++) {
			System.out.printf("%s %s %s %s %d %d %d", Bil[i].ID, Bil[i].c.name, Bil[i].c.address, Bil[i].m.name
					,Bil[i].amount, Bil[i].balance, Bil[i].profit);
			System.out.println();
		}
		input.close();
	}
}
