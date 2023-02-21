package J05067;
import java.util.*;
public class Main {
	public static Map<String, String> Brand = new HashMap<>();
	public static void setBrand() {		
		Brand.put("BP", "British Petro");
		Brand.put("ES", "Esso");
		Brand.put("SH", "Shell");
		Brand.put("CA", "Castrol");
		Brand.put("MO", "Mobil");
		Brand.put("TN", "Trong Nuoc");
	}

	public static void main(String[] args) {
		setBrand();
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();		
		ArrayList<Merchandise> Mer = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Mer.add(new Merchandise(input.next(), input.nextInt()));
		}
		for(Merchandise mem: Mer) {
			System.out.print(mem.toString());
		}
		
		input.close();
	}

}
