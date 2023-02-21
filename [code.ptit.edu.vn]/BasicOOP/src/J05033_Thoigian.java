import java.util.*;
public class J05033_Thoigian {
	
	private int hour;
	private int min;
	private int sec;
	
	J05033_Thoigian(){
	}
	
	J05033_Thoigian(int Hour, int Min, int Sec){
		sec = Sec % 60;
		min = Min;
		hour = Hour;
	}
	
	public static void sort(J05033_Thoigian[] arr) {
		for(int i = 1; i < arr.length; i++) {
			J05033_Thoigian tmp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {	
				if(arr[j].hour > tmp.hour)
					arr[j + 1] = arr[j];
				else if(arr[j].hour == tmp.hour) {
					if(arr[j].min > tmp.min)
						arr[j + 1] = arr[j];
					else if(arr[j].min == tmp.min) {
						if(arr[j].sec > tmp.sec)
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
		int n = input.nextInt();
		J05033_Thoigian[] arr = new J05033_Thoigian[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new J05033_Thoigian(input.nextInt(),input.nextInt(),input.nextInt());
		}
		J05033_Thoigian.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d %d %d", arr[i].hour, arr[i].min, arr[i].sec);
			System.out.println();
		}
		
		input.close();
	}

}
