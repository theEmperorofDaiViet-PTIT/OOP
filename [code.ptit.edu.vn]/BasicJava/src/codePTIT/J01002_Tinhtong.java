package codePTIT;
import java.util.*;
public class J01002_Tinhtong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		while(test-->0) {
			long N = input.nextInt();
			System.out.println(N * (N + 1) / 2);
		}
	}

}
	