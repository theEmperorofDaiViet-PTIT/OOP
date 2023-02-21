package J05078;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountDepartment = input.nextInt();
		ArrayList<Department> Dep = new ArrayList<>();
		Map<String,String> Depa = new HashMap<>();
		for(int i = 0; i < amountDepartment; i++){
			Dep.add(new Department(input.next(), input.nextLine()));
			Depa.put(Dep.get(i).getID(), Dep.get(i).getName());
		}
		int amountStaff = input.nextInt();
		input.nextLine();
		ArrayList<Staff> Sta = new ArrayList<>();
		for(int i = 0; i < amountStaff; i++) {
			Sta.add(new Staff(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
			Sta.get(i).calDepartment(Dep);
		}
		String D = input.nextLine();
		System.out.printf("Bang luong phong %s:\n", Depa.get(D));
		
		for(Staff mem: Sta) {
			if(mem.getDepartment().getID().compareTo(D) == 0)
				System.out.print(mem.toString());
		}
		input.close();
	}

}
