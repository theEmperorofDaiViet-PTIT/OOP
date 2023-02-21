package codePTIT;
import java.util.*;
public class J02031_Sapxepchon_Lietkenguoc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		String[] res = new String[n - 1];
		Arrays.fill(res, "");
		for(int i = 0; i< n; i++) {
			a[i] = input.nextInt();
		}
		for(int i = 0; i < n - 1; i++) {
			int jimin = i;
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[jimin]) {
					jimin = j;
				}
			}
			int tmp = a[jimin];
			a[jimin] = a[i];
			a[i] = tmp;
			res[i] += "Buoc " + (i+1) + ":";
			for(int k = 0; k < n; k++) {
				res[i] += " " + a[k];
			}
		}
		for(int i = n - 2; i >= 0; i--) {
			System.out.println(res[i]);
		}
	}

}
