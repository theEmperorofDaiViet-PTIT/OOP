package codePTIT;
import java.util.*;
public class J02008_LCM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		while(test-->0) {
			long n = input.nextLong();
			long k = 1;
			for(long i = 2; i <= n; i++) {
				k = LCM(k,i);
			}
			System.out.println(k);
		}
	}
	public static long LCM(long a, long b) {
		long A = a, B = b;
		long temp = b;
		while(b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return A * B / a;
	}

}
