import java.util.*;
public class J05006_Nhanvien {
	
	private String ID = "";
	private String name = "";
	private String sex = "";
	private String dob = "";
	private String address = "";
	private String taxID = "";
	private String since = "";
	
	private void getID() {
		while(ID.length() < 2) {
			ID = "0" + ID;
		}
		ID = "000" + ID;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		J05006_Nhanvien[] arr = new J05006_Nhanvien[t];
		for(int i = 0; i < t; i++) {
			arr[i] = new J05006_Nhanvien();
			arr[i].ID += (i + 1);
			arr[i].getID();
			arr[i].name = input.nextLine();
			arr[i].sex = input.nextLine();
			arr[i].dob = input.nextLine();
			arr[i].address = input.nextLine();
			arr[i].taxID = input.nextLine();
			arr[i].since = input.nextLine();
		}
		for(int i = 0; i < t; i++) {
			System.out.printf("%s %s %s %s %s %s %s", arr[i].ID, arr[i].name, arr[i].sex, arr[i].dob,
					arr[i].address, arr[i].taxID, arr[i].since);
			System.out.println();
		}
		input.close();
	}

}
