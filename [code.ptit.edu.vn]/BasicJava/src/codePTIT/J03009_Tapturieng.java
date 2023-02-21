package codePTIT;
import java.util.*;
public class J03009_Tapturieng {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		while(t-->0) {
			String s11 = input.nextLine();
			String[] s1 = s11.split(" ");
			String s21 = input.nextLine();
			String[] s2 = s21.split(" ");
			Arrays.sort(s1);
			Arrays.sort(s2);
			String res = "";
			for(int j = 0; j < s2.length; j++) {
				if(s1[0].compareTo(s2[j]) == 0)
					break;
				if(j == s2.length - 1)
					res += s1[0] + " ";
			}
			for(int i = 1; i < s1.length; i++) {
				if(s1[i].compareTo(s1[i-1]) == 0)
					continue;
				for(int j = 0; j < s2.length; j++) {
					if(s1[i].compareTo(s2[j]) == 0)
						break;
					if(j == s2.length - 1)
						res += s1[i] + " ";
				}
			}
			System.out.println(res);
		}
	}

}
