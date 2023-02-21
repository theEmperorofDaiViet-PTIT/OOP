package J05028;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountCorp = input.nextInt();
		ArrayList<Corp> Cor = new ArrayList<>();
		for(int i = 0; i < amountCorp; i++) {
			Cor.add(new Corp());
			input.nextLine();
			Cor.get(i).ID = input.nextLine();
			Cor.get(i).name = input.nextLine();
			Cor.get(i).amountIntern = input.nextInt();
		}
		Collections.sort(Cor);
		for(int i = 0; i < amountCorp; i++) {
			System.out.printf("%s %s %d\n", Cor.get(i).ID, Cor.get(i).name, Cor.get(i).amountIntern);
		}
		input.close();
	}

}
