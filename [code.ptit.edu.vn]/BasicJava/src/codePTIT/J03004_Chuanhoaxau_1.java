package codePTIT;
import java.util.*;
public class J03004_Chuanhoaxau_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		input.nextLine();
		while(test-->0) {
			String s = input.nextLine();
			s = s.trim();
			s = s.toLowerCase();
			String S = "";
			String[] a = s.split(" ");
			for(String mem: a) {
				if(mem.length() > 0)
					S += mem.substring(0,1).toUpperCase() + mem.substring(1) + " ";
			}
			S = S.trim();
			System.out.println(S);                                                                                                                                                                                                       
		}
	}

}
