package codePTIT;
import java.util.*;
public class J02030_Sapxepchen_Lietkenguoc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		String[] res = new String[n];
		Arrays.fill(res, "");
		res[0] += "Buoc 0: " + a[0];
		for(int i = 1; i < n; i++) {
			int tmp = a[i];
			int j;
			for(j = i - 1; j >= 0 && a[j] > tmp;j--) {
				a[j + 1] = a[j];
			}
			a[j+1] = tmp;
			res[i] += "Buoc " + (i) + ":";
			for(int k = 0; k <= i; k++) {
				res[i] += " " + a[k];
			}
		}
		for(int i = n - 1; i >= 0; i--) {
			System.out.println(res[i]);
		}
	}

}
