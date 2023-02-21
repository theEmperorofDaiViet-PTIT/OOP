package codePTIT;
import java.util.*;
public class J03010_email {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		input.nextLine();
		String[] result = new String[test];
		Arrays.fill(result, "");
		int[] appearence = new int[test];
		int count = 0;
		Arrays.fill(appearence, 1);
		while(test-->0) {
			String s = input.nextLine();
			s = s.trim();
			s = s.toLowerCase();
			String S = "";
			String forename = "";
			String[] a = s.split(" ");
			for(int i = 0; i < a.length; i++) {
				if(i == a.length - 1) {
					forename += a[i];
				}
				else
				if(a[i].length() > 0)
					S += a[i].substring(0,1);
			}
			forename += S + "@ptit.edu.vn";
			for(int i = 0; i < result.length; i++) {
				if( result[i].equals(forename) == true) {                  
						String[] temp = forename.split("@");
						appearence[i]++;
						String tmp = Integer.toString(appearence[i]);
						result[count] += temp[0] + tmp + "@" + temp[1];
						break;
					}
				if(i == result.length - 1) {
					result[count] += forename;
				}
			}
			System.out.println(result[count]);
			count++;
		}

	}

}
