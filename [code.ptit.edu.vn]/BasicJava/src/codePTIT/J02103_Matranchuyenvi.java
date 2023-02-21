package codePTIT;
import java.util.*;
public class J02103_Matranchuyenvi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int test = 1; test <= t; test++) {
			int N = input.nextInt();
			int M = input.nextInt();
			int[][] arr = new int[N][M];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					arr[i][j] = input.nextInt();
				}
			}
			System.out.println("Test " + test + ":");
			int[][] res = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					res[i][j] = 0;
					for(int k = 0; k < M; k++) {
						res[i][j] += arr[i][k] * arr[j][k];
					}
					System.out.print(res[i][j] + " ");
					if(j == N - 1)
						System.out.println();
				}
			}
			
		}

	}

}
