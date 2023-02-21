package codePTIT;
import java.util.*;
import java.lang.StringBuilder;
public class J03027_Rutgonxau {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		StringBuilder s = new StringBuilder(in);
		for(int i = 0; i < s.length() - 1;) {
			if(s.charAt(i) == s.charAt(i + 1)) {	
				s.delete(i, i+2);
				i = 0;
				continue;
			}
			i++;
		}
		if(s.length() == 0){
			System.out.println("Empty String");
		}
		else
			System.out.println(s);
		input.close();
	}

}
