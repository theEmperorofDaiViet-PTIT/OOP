package codePTIT;
import java.util.*;
public class J02105_Danhsachke {

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
			System.out.print("List(" + (i+1) +") =");
			for(int j = 0; j < n; j++) {
				if(arr[i][j] != 0) {
					System.out.print(" " + (j+1));
				}
				
			}
			System.out.println();
		}

	}

}
