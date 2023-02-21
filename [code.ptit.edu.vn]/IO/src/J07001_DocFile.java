import java.io.*;
import java.util.*;
public class J07001_DocFile {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File("DATA.in"));
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}

}
