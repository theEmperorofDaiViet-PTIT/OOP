package codePTIT;
import java.util.*;
public class J02104_Danhsachcanh {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = input.nextInt();		
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i][j] != 0) {
					System.out.println("(" + (i+1) + "," + (j+1) + ")");
				}
				
			}
		}

	}

}
