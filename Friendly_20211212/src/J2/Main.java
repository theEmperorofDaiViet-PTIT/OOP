package J2;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("CATHI.in"));
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Ca> C = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			C.add(new Ca(i+1, input.nextLine(), input.nextLine(), input.nextLine()));
		}
		Collections.sort(C);
		for(Ca mem: C) {
			System.out.print(mem.toString());
		}

	}

}
