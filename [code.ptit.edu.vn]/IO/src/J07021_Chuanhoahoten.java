import java.util.*;
import java.io.*;
public class J07021_Chuanhoahoten {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("DATA.in"));
		
		while(in.hasNextLine()) {
			String s = in.nextLine();
			s = s.trim();
			s = s.toLowerCase();
			if(s.compareTo("end") == 0)
				break;
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
