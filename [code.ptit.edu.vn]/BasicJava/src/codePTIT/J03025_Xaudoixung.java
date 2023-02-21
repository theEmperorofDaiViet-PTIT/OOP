package codePTIT;
import java.util.*;
public class J03025_Xaudoixung {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0) {
			String s = input.next();
			int count = 0;
			for(int i = 0; i <= (int)(s.length() / 2 - 1); i++)
				if(s.charAt(i) != s.charAt(s.length() - 1 - i)) 
					count++;
			boolean check = false;
			if(count == 1)
				check = true;
			else if(count == 0 && s.length() % 2 == 1)
				check = true;
			if(check == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
