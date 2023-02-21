import java.util.*;
public class J05018_Hocsinh {
	
	private String ID = "";
	private String name;
	private double Mathematics;
	private double Literature;
	private double ForeignLanguage;
	private double Physics;
	private double Chemistry;
	private double Biology;
	private double History;
	private double Geography;
	private double CivicEducation;
	private double Technology;
	private double Agg;
	private String tier;
	
	private void getAgg() {
		Agg = (Mathematics * 2 + Literature * 2 + ForeignLanguage + Physics + Chemistry + Biology + History + Geography + CivicEducation + Technology) / 12;
		Agg = Math.round(Agg * 10.0) / 10.0;
	}
	
	private void getID(int i) {
		ID += (i+1);
		while(ID.length() < 2) {
			ID = "0" + ID;
		}
		ID = "HS" + ID;
	}
	
	private void getTier() {
		if(Agg >= 9.0)
			tier = "XUAT SAC";
		else if(Agg >= 8.0)
			tier = "GIOI";
		else if(Agg >= 7.0)
			tier = "KHA";
		else if(Agg >= 5.0)
			tier = "TB";
		else
			tier = "YEU";
	}
	public static void sortByAgg(J05018_Hocsinh[] arr) {
		for(int i = 1; i < arr.length; i++) {
			J05018_Hocsinh tmp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {	
				if(arr[j].Agg < tmp.Agg)
					arr[j + 1] = arr[j];
				else if(arr[j].Agg == arr[j].Agg) {
					if(arr[j].ID.compareTo(tmp.ID) > 0) {
						arr[j + 1] = arr[j];
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
		J05018_Hocsinh[] arr = new J05018_Hocsinh[t];
		for(int i = 0; i < t; i++) {
			arr[i] = new J05018_Hocsinh();
			input.nextLine();
			arr[i].name = input.nextLine();
			arr[i].getID(i);
			arr[i].Mathematics = input.nextDouble();
			arr[i].Literature = input.nextDouble();
			arr[i].ForeignLanguage = input.nextDouble();
			arr[i].Physics = input.nextDouble();
			arr[i].Chemistry = input.nextDouble();
			arr[i].Biology = input.nextDouble();
			arr[i].History = input.nextDouble();
			arr[i].Geography = input.nextDouble();
			arr[i].CivicEducation = input.nextDouble();
			arr[i].Technology = input.nextDouble();
			arr[i].getAgg();
			arr[i].getTier();
		}
		J05018_Hocsinh.sortByAgg(arr);
		for(int i = 0; i < t; i++) {
			System.out.printf("%s %s %.1f %s", arr[i].ID, arr[i].name, arr[i].Agg, arr[i].tier);
			System.out.println();
		}
		input.close();
	}

}
