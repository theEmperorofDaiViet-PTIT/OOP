package codePTIT;
import java.util.*;
public class J01022_Xaunhiphan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			int N = input.nextInt();
			int K = input.nextInt();
			generate(N, K);
		}

	}
	
	public static void generate(int N, int K) {
		String a = "0";
		String b = "1";
		if(N <= 1)
			return;
		if(N == 2) {
			if(K == 1)
				System.out.println(b.charAt(0));
			return;
		}
		
		if(N < 93) {
			int count = 2;
			while(count <= N) {
				String tmp = b;
				b = a + b;
				a = tmp;
				count++;
			}
			if(K < 1 || K > b.length())
				return;
			System.out.println(b.charAt(K-1));
		}
		return;
	}

}
