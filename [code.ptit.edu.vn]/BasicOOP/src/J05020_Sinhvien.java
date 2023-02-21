import java.util.*;
public class J05020_Sinhvien {
	
	private String ID;
	private String name;
	private String Class;
	private String email;
	
	public static void sort(J05020_Sinhvien[] arr) {
		for(int i = 1; i < arr.length; i++) {
			J05020_Sinhvien tmp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {	
				if(arr[j].Class.compareTo(tmp.Class) > 0)
					arr[j + 1] = arr[j];
				else if(arr[j].Class.compareTo(tmp.Class) == 0) {
					if(arr[j].ID.compareTo(tmp.ID) > 0)
						arr[j + 1] = arr[j];
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
		J05020_Sinhvien[] arr = new J05020_Sinhvien[t];
		for(int i = 0; i < t; i++) {
			arr[i] = new J05020_Sinhvien();
			arr[i].ID = input.nextLine();
			arr[i].name = input.nextLine();
			arr[i].Class = input.nextLine();
			arr[i].email = input.nextLine();
		}
		J05020_Sinhvien.sort(arr);
		for(int i = 0; i < t; i++) {
			System.out.printf("%s %s %s %s", arr[i].ID, arr[i].name, arr[i].Class, arr[i].email);
			System.out.println();
		}		
		input.close();
	}

}
