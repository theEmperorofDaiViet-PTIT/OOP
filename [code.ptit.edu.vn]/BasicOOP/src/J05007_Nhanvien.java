import java.util.*;
public class J05007_Nhanvien {
	
	private String ID = "";
	private String name = "";
	private String sex = "";
	private String dob = "";
	private String date = "";
	private String month = "";
	private String year = "";
	private String address = "";
	private String taxID = "";
	private String since = "";
	
	private void getID() {
		while(ID.length() < 2) {
			ID = "0" + ID;
		}
		ID = "000" + ID;
	}
	
	private void getDMY() {
		String[] s = dob.split("/");
		date = s[0];
		month = s[1];
		year = s[2];
	}
	
	public static void sort(J05007_Nhanvien[] arr) {
		for(int i = 1; i < arr.length; i++) {
			J05007_Nhanvien tmp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {	
				if(arr[j].year.compareTo(tmp.year) > 0)
					arr[j + 1] = arr[j];
				else if(arr[j].year.compareTo(tmp.year) == 0) {
					if(arr[j].month.compareTo(tmp.month) > 0)
						arr[j + 1] = arr[j];
					else if(arr[j].month.compareTo(tmp.month) == 0) {
						if(arr[j].date.compareTo(tmp.date) > 0)
							arr[j + 1] = arr[j];
						else
							break;	
					}
					else
						break;	
				}
				else
					break;			
			}
			arr[j+1] = tmp;
		}
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		J05007_Nhanvien[] arr = new J05007_Nhanvien[t];
		for(int i = 0; i < t; i++) {
			arr[i] = new J05007_Nhanvien();
			arr[i].ID += (i + 1);
			arr[i].getID();
			arr[i].name = input.nextLine();
			arr[i].sex = input.nextLine();
			arr[i].dob = input.nextLine();
			arr[i].getDMY();
			arr[i].address = input.nextLine();
			arr[i].taxID = input.nextLine();
			arr[i].since = input.nextLine();
		}
		J05007_Nhanvien.sort(arr);
		for(int i = 0; i < t; i++) {
			System.out.printf("%s %s %s %s %s %s %s", arr[i].ID, arr[i].name, arr[i].sex, arr[i].dob,
					arr[i].address, arr[i].taxID, arr[i].since);
			System.out.println();
		}
		input.close();
	}
}
