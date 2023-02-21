package codePTIT;
import java.util.*;
public class J03005_Chuanhoa_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		input.nextLine();
		while(test-->0) {
			String s = input.nextLine();
			s = s.trim();
			s = s.toLowerCase();
			String S = "";
			String surname = "";
			String[] a = s.split(" ");
			for(int i = 0; i < a.length; i++) {
				if(i == 0) {
					if(a[i].length() > 0)
						surname += a[i].substring(0,1).toUpperCase() + a[i].substring(1);
				}
				else
				if(a[i].length() > 0)
					S += a[i].substring(0,1).toUpperCase() + a[i].substring(1) + " ";
			}
			surname = surname.toUpperCase();
			S = S.trim();
			S += ", " + surname;
			System.out.println(S);                                                                                                                                                                                                       
		}
	}

}


