package codePTIT;
import java.util.*;
public class J01007_Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			long n = input.nextLong();
			if(Fibonacci(n) == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
	
	public static boolean Fibonacci(long n) {
		long a = 0, b = 1;
		int count = 0;
		while((a < n && b < n) && (count <= 91)) {
			long tmp = b;
			b = a + b;
			a = tmp;
			count++;
		}
		if(a == n || b == n)
			return true;
		return false;
	}

}