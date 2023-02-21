import java.util.*;
public class J05003_Sinhvien {
	
	private String ID = "";
	private String name;
	private String dob;
	private String DOB = "";
	private String Class;
	private double GPA;
	
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
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		J05003_Sinhvien[] arr = new J05003_Sinhvien[t];
		for(int i = 0; i < t; i++) {
			arr[i] = new J05003_Sinhvien();
			input.nextLine();
			arr[i].ID += (i + 1);
			arr[i].getID();
			arr[i].name = input.nextLine();
			arr[i].Class = input.nextLine();
			arr[i].dob = input.nextLine();
			arr[i].getDoB();
			arr[i].GPA = input.nextDouble();			
		}
		for(int i = 0; i < t; i++) {
			System.out.printf("%s %s %s %s %.2f", arr[i].ID, arr[i].name, arr[i].Class, arr[i].DOB, arr[i].GPA);
			System.out.println();
		}
		
		
		input.close();
	}

}
