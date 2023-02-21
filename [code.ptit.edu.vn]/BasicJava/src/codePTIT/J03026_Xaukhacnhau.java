package codePTIT;
import java.util.*;
public class J03026_Xaukhacnhau {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			String s1 = input.next();
			String s2 = input.next();
			if(s1.compareTo(s2) == 0)
				System.out.println(-1);
			else
				System.out.println(Math.max(s1.length(),s2.length()));
		}

	}

}
