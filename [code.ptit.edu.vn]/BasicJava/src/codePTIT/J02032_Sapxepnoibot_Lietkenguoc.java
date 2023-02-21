package codePTIT;
import java.util.*;
public class J02032_Sapxepnoibot_Lietkenguoc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			int n = input.nextInt();
			int[] a = new int[n];
			String[] res = new String[n - 1];
			Arrays.fill(res, "");
			for(int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			for(int i = 0; i < n - 1; i++) {
				boolean completed = true;
				for(int j = 0; j < n - i - 1; j++) {
					if(a[j] > a[j + 1]) {
						int tmp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = tmp;
						completed = false;
					}
				}
				if(completed == true)
					break;
				res[i] += "Buoc " + (i + 1) + ":";
				for(int k = 0; k < n; k++) {
					res[i] += " " + a[k];
				}
			}
			for(int i = n - 2; i >= 0; i--) {
				if(res[i] != "")
					System.out.println(res[i]);
			}
		}
	}

}
