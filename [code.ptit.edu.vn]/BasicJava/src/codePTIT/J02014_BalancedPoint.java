package codePTIT;
import java.util.*;
public class J02014_BalancedPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		while(test-->0) {
			int N = input.nextInt();
			int[] a = new int[N];
			for(int i = 0; i < N; i++) {
				a[i] = input.nextInt();
			}
			boolean found = false;
			int result = 0;
			int sum_right = 0;
			for (int i: a)
				sum_right += i;
			int sum_left = 0;
			for(int i = 0; i < N; i++) {
				sum_right -= a[i];
				if(sum_left == sum_right) {
					result = i + 1;
					found = true;
					break;
				}
				sum_left += a[i];
			}
			if(found == true){
				System.out.println(result);
			}
			else
				System.out.println(-1);
		}

	}

}
