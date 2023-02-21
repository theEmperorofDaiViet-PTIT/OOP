import java.util.*;
public class J05011_Gamer {
	
	private String ID;
	private String name;
	private String begin;
	private String end;
	private String beginHour;
	private String beginMin;
	private String endHour;
	private String endMin;
	private int totalHour;
	private int totalMin;
	private int totalTime;
	
	private void getTime() {
		String[] s1 = begin.split(":");
		beginHour = s1[0];
		beginMin = s1[1];
		String[] s2 = end.split(":");
		endHour = s2[0];
		endMin = s2[1];
	}
	
	private void calculateTime() {
		int bH = Integer.parseInt(beginHour);
		int bM = Integer.parseInt(beginMin);
		int eH = Integer.parseInt(endHour);
		int eM = Integer.parseInt(endMin);
		totalHour = eH - bH;
		if(eM >= bM) {
			totalMin = eM - bM;
		}
		else {
			totalHour--;
			totalMin = 60 - (bM - eM);
		}
		totalTime = totalHour * 60 + totalMin;
	}
	
	public static void sortByTotalTime(J05011_Gamer[] arr) {
		for(int i = 1; i < arr.length; i++) {
			J05011_Gamer tmp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {	
				if(arr[j].totalTime < tmp.totalTime)
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
		input.nextLine();
		J05011_Gamer[] arr = new J05011_Gamer[t];
		for(int i = 0; i < t; i++) {
			arr[i] = new J05011_Gamer();
			arr[i].ID = input.nextLine();
			arr[i].name = input.nextLine();
			arr[i].begin = input.nextLine();
			arr[i].end = input.nextLine();
			arr[i].getTime();
			arr[i].calculateTime();
		}
		J05011_Gamer.sortByTotalTime(arr);
		for(int i = 0; i < t; i++) {
			System.out.printf("%s %s %d %s %d %s", arr[i].ID, arr[i].name, arr[i].totalHour, "gio", arr[i].totalMin, "phut");
			System.out.println();
		}
		input.close();
	}

}
