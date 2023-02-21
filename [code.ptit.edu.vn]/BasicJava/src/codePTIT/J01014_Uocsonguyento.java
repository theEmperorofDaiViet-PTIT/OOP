package codePTIT;
import java.util.*;
public class J01014_Uocsonguyento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			long n = input.nextLong();
			if(n > 1)
				System.out.println(analyze(n));
		}
	}
	public static long analyze(long n) {
		long max_factor = 0;
		while(n % 2 == 0) {
			max_factor = 2;
			n /= 2;
		}
		for(long i = 3; i <= Math.sqrt(n); i += 2) {
			if(n % i == 0) {
				while(n % i == 0) {
					max_factor = i;
					n /= i;
				}
			}
		}
		if(n > 1) {
			max_factor = n;
		}
		return  max_factor;
	}

}
