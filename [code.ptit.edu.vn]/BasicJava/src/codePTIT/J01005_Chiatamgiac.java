package codePTIT;
import java.util.*;
public class J01005_Chiatamgiac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			int n = input.nextInt();
			double h = input.nextDouble();
			double[] arr = new double[n];
			arr[0] = 0;
			for(int i = 1; i <= n - 1; i++) {
				arr[i] = Math.sqrt(h*h / n * i);
				System.out.printf("%.6f ",arr[i]);
				if(i == n - 1)
					System.out.println();
			}
		}

	}

}
