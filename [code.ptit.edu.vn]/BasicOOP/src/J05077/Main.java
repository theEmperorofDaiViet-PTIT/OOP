package J05077;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountDepartment = input.nextInt();
		ArrayList<Department> Dep = new ArrayList<>();
		for(int i = 0; i < amountDepartment; i++){
			Dep.add(new Department(input.next(), input.nextLine()));
		}
		int amountStaff = input.nextInt();
		input.nextLine();
		ArrayList<Staff> Sta = new ArrayList<>();
		for(int i = 0; i < amountStaff; i++) {
			Sta.add(new Staff(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
			Sta.get(i).calDepartment(Dep);
		}
		for(Staff mem: Sta) {
			System.out.print(mem.toString());
		}
		input.close();
	}

}
