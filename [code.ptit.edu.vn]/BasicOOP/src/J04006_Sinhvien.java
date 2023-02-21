import java.util.*;
public class J04006_Sinhvien {
	
	J04006_Sinhvien(){
	}
	
	String ID = "";
	String name = "";
	String Class = "";
	String dob = "";
	String DOB = "";
	float GPA = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		J04006_Sinhvien stu = new J04006_Sinhvien();
		stu.ID = "B20DCCN001";
		stu.name += input.nextLine();
		stu.Class += input.nextLine();
		stu.dob += input.nextLine();
		stu.GPA += input.nextFloat();
		
		if (stu.dob.length() < 10) {
			String[] s = stu.dob.split("/");
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
				stu.DOB += s[i];
				if(i < 2)
					stu.DOB += "/";
			}
		}
		else
			stu.DOB += stu.dob;
		System.out.printf("%s %s %s %s %.2f", stu.ID, stu.name, stu.Class, stu.DOB, stu.GPA);
	}

}
