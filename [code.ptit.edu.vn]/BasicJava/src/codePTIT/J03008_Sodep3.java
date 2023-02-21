package codePTIT;
import java.util.*;
public class J03008_Sodep3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		while(test-->0) {
			String s = input.next();
			if(check(s) == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	public static boolean check(String s) {
		for(int i = 0, j = s.length() - 1; i <= j; i++, j--) {
			if(PRIME(Character.getNumericValue(s.charAt(i))) == false)
				return false;
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
		
	}
	public static boolean PRIME(int n) {
		if(n < 2)
			return false;
		if(n % 2 == 0) {
			if(n == 2)
				return true;
			else
				return false;
		}
		boolean check = true;
		for(int i = 3; i <= Math.sqrt(n); i += 2) {
			if(n % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}
}
