package J3;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		Scanner input1 = new Scanner(new File("MONTHI.in"));
		Scanner input2 = new Scanner(new File("CATHI.in"));
		Scanner input3 = new Scanner(new File("LICHTHI.in"));
		
		ArrayList<Subject> Sub = new ArrayList<>();
		int amountSub = input1.nextInt();
		input1.nextLine();
		for(int i = 0; i < amountSub; i++) {
			Sub.add(new Subject(input1.nextLine(), input1.nextLine(), input1.nextLine()));
		}
		
		int amountCa = input2.nextInt();
		input2.nextLine();
		ArrayList<Ca> C = new ArrayList<>();
		for(int i = 0; i < amountCa; i++) {
			C.add(new Ca(i+1, input2.nextLine(), input2.nextLine(), input2.nextLine()));
		}
		
		int amount = input3.nextInt();
		ArrayList<Thi> T = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			T.add(new Thi());
			T.get(i).setCa(input3.next(), C);
			T.get(i).setSub(input3.next(), Sub);
			T.get(i).setClass(Integer.parseInt(input3.next()));
			T.get(i).setStu(input3.nextInt());
		}
		Collections.sort(T);
		for(Thi mem: T) {
			System.out.printf("%s %s %s %s %s %d\n", mem.getCa().getDMY(), mem.getCa().getHM(), mem.getCa().getRoom(),
					mem.getSub().getName(), mem.getclass(), mem.getStu());
		}
	}

}
