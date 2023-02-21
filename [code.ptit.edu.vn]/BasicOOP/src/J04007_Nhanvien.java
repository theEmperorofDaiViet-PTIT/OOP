import java.util.*;
public class J04007_Nhanvien {
	
	private String ID = "00001";
	private String name = "";
	private String sex = "";
	private String dob = "";
	private String address = "";
	private String taxID = "";
	private String since = "";
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		J04007_Nhanvien staff = new J04007_Nhanvien();
		staff.name = input.nextLine();
		staff.sex = input.nextLine();
		staff.dob = input.nextLine();
		staff.address = input.nextLine();
		staff.taxID = input.nextLine();
		staff.since = input.nextLine();
		
		System.out.printf("%s %s %s %s %s %s %s", staff.ID, staff.name, staff.sex, staff.dob,
				staff.address, staff.taxID, staff.since);
		
		input.close();
	}

}
