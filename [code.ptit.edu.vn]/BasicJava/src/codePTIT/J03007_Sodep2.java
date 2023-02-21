package codePTIT;
import java.util.*;
public class J03007_Sodep2 {

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
		if(!(s.charAt(0) == '8' && s.charAt(s.length()-1) == '8')) {
			return false;
		}
		int sum = 0;
		for(int i = 0, j = s.length() - 1; i <= j; i++, j--) {
			if(i < j)
				sum = sum + Character.getNumericValue(s.charAt(i)) + Character.getNumericValue(s.charAt(j));
			else if(i == j)
				sum += Character.getNumericValue(s.charAt(i));
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		if(sum % 10 != 0)
			return false;
		else
			return true;
	}

}
