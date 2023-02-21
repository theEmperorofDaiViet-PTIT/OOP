package J05025;
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
			Prof.get(i).getForeName();
			Prof.get(i).major = input.nextLine();
			Prof.get(i).getMajorID();
		}
		Collections.sort(Prof);
		for(int i = 0; i < amount; i++) {
			System.out.printf("%s %s %s\n", Prof.get(i).ID, Prof.get(i).name, Prof.get(i).majorID);
		}
		
		
		input.close();
	}

}
