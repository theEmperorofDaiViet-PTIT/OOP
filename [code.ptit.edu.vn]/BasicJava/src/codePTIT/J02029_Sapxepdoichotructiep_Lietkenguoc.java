package codePTIT;
import java.util.*;
public class J02029_Sapxepdoichotructiep_Lietkenguoc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			int n = input.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			String[] res = new String[n - 1];
			Arrays.fill(res, "");
			for(int i = 0; i < n - 1; i++) {
				for(int j = i + 1; j < n; j++) {
					if(a[i] > a[j]) {
						int tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
					}
				}
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

}
