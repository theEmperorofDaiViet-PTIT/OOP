import java.util.*;
public class J04012_Nhanvien {
	
	private String ID = "NV01";
	private String name;
	private int wage;
	private int days;
	private String role;
	
	private int salary() {
		return wage * days;
	}
	
	private int reward() {
		if(days >= 25)
			return salary() * 20 / 100;
		else if(days >= 22)
			return salary() * 10 / 100;
		else
			return 0;
	}
	
	private int bonus() {
		if(role.compareTo("GD") == 0)
			return 250000;
		else if(role.compareTo("PGD") == 0)
			return 200000;
		else if(role.compareTo("TP") == 0)
			return 180000;
		else
			return 150000;
	}
	private int income() {
		return salary() + reward() + bonus();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		J04012_Nhanvien staff = new J04012_Nhanvien();
		staff.name = input.nextLine();
		staff.wage = input.nextInt();
		staff.days = input.nextInt();
		input.nextLine();
		staff.role = input.nextLine();
		
		System.out.printf("%s %s %d %d %d %d", staff.ID, staff.name, staff.salary(), staff.reward(), staff.bonus(), staff.income());
		
		input.close();
	}

}
