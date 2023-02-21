package J05032;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Person> P = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			P.add(new Person());
			P.get(i).name = input.next();
			P.get(i).DoB = input.next();
			P.get(i).getTime();
			P.get(i).setTime();
		}
		Collections.sort(P);
		System.out.printf("%s\n%s",P.get(0).name, P.get(amount - 1).name);
		
		input.close();
	}

}
