import java.util.*;
public class J04015_Teacher {
	
	private String code ;
	private String name;
	private int rawSalary;
	
	private String role;
	private int index;
	private int bonus;
	private int income;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		J04015_Teacher T = new J04015_Teacher();		
		T.code = input.nextLine();
		T.role = T.code.substring(0,2);
		T.index = Integer.parseInt(T.code.substring(2));
		T.name = input.nextLine();
		T.rawSalary = input.nextInt();
		if(T.role.compareTo("HT") == 0)
			T.bonus = 2000000;
		else if(T.role.compareTo("HP") == 0)
			T.bonus = 900000;
		else if(T.role.compareTo("GV") == 0)
			T.bonus = 500000;
		
		T.income = T.index * T.rawSalary + T.bonus;
		System.out.printf("%s %s %d %d %d", T.code, T.name, T.index, T.bonus, T.income);
		input.close();
	}

}
