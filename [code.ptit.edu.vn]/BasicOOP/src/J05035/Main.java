package J05035;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Student> Stu = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			Stu.add(new Student());
			Stu.get(i).Order = i + 1;
			Stu.get(i).ID = input.nextLine();
			Stu.get(i).name = input.nextLine();
			Stu.get(i).Class = input.nextLine();
			Stu.get(i).email = input.nextLine();
			Stu.get(i).Corp = input.nextLine();
		}
		int amountQuery = input.nextInt();
		input.nextLine();
		for(int i = 0; i < amountQuery; i++) {
			String Query = input.nextLine();
			ArrayList<Student> res = new ArrayList<>();
			for(Student mem: Stu) {
				if(mem.Corp.compareTo(Query) == 0) {
					res.add(mem);
				}
			}
			Collections.sort(res);
			for(Student mem: res) {
				System.out.printf("%d %s %s %s %s %s\n", mem.Order, mem.ID, mem.name,
						mem.Class, mem.email, mem.Corp);
			}
		}
		
		
		input.close();
	}
}
