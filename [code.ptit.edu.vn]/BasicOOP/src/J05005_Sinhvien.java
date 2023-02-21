import java.util.*;
public class J05005_Sinhvien {

	private String ID = "";
	private String name;
	private String Name = "";
	private String dob;
	private String DOB = "";
	private String Class;
	private double GPA;
	
	public void getName() {
		name = name.trim();
		name = name.toLowerCase();
		String[] a = name.split(" ");
		for(String mem: a) {
			if(mem.length() > 0)
				Name += mem.substring(0,1).toUpperCase() + mem.substring(1) + " ";
		}
		Name = Name.trim();
	}
	
	public void getID() {
		while(ID.length() < 3) {
			ID = "0" + ID;
		}
		ID = "B20DCCN" + ID;
	}
	
	public void getDoB() {
		if(dob.length() < 10) {
			String[] s = dob.split("/");
			for(int i = 0; i < 3; i++) {
				if(i < 2) {
					while(s[i].length() < 2) {
						s[i] = "0" + s[i];
					}
				}
				if(i == 2) {
					while(s[i].length() < 4) {
						s[i] = "0" + s[i];
					}
				}
			}
			for(int i = 0; i < 3; i++) {
				DOB += s[i];
				if(i < 2)
					DOB += "/";
			}
		}
		else
			DOB += dob;		
	}
	
	public static void sortByGPA(J05005_Sinhvien[] arr) {
		for(int i = 1; i < arr.length; i++) {
			J05005_Sinhvien tmp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {	
				if(arr[j].GPA < tmp.GPA)
					arr[j + 1] = arr[j];
				else
					break;			
			}
			arr[j+1] = tmp;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		J05005_Sinhvien[] arr = new J05005_Sinhvien[t];
		for(int i = 0; i < t; i++) {
			arr[i] = new J05005_Sinhvien();
			input.nextLine();
			arr[i].ID += (i + 1);
			arr[i].getID();
			arr[i].name = input.nextLine();
			arr[i].getName();
			arr[i].Class = input.nextLine();
			arr[i].dob = input.nextLine();
			arr[i].getDoB();
			arr[i].GPA = input.nextDouble();			
		}
		J05005_Sinhvien.sortByGPA(arr);
		for(int i = 0; i < t; i++) {
			System.out.printf("%s %s %s %s %.2f", arr[i].ID, arr[i].Name, arr[i].Class, arr[i].DOB, arr[i].GPA);
			System.out.println();
		}
		
		
		input.close();
	}
}
