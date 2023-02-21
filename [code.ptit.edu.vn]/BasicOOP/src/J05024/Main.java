package J05024;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		Map<String, String> Major = new HashMap<>();
		Major.put("Ke toan", "DCKT");
		Major.put("Cong nghe thong tin", "DCCN");
		Major.put("An toan thong tin", "DCAT");
		Major.put("Vien thong", "DCVT");
		Major.put("Dien tu", "DCDT");
		ArrayList<String> blackList = new ArrayList<>();
		blackList.add("DCCN");
		blackList.add("DCAT");
		ArrayList<Student> Stu = new ArrayList<>();
		
		for(int i = 0; i < amount; i++){
			Stu.add(new Student());
			Stu.get(i).ID = input.nextLine();
			Stu.get(i).name = input.nextLine();
			Stu.get(i).Class = input.nextLine();
			Stu.get(i).email = input.nextLine();
			Stu.get(i).getMajor();
		}
		int amountQuery = input.nextInt();
		input.nextLine();
		for(int i = 0; i < amountQuery; i++) {
			Student.query(Stu, Major, blackList, input.nextLine());
		}
		input.close();

	}

}
