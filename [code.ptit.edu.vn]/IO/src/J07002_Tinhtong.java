import java.util.*;
import java.io.*;
public class J07002_Tinhtong {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("DATA.in"));
		long sum = 0;
		while(input.hasNext()) {
			try {
				int i = Integer.parseInt(input.next());
				sum += i;
			}
			catch(NumberFormatException ex){
				continue;
			}
			
		}
		System.out.println(sum);
	}

}
