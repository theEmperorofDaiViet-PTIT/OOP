import java.io.*;
import java.util.*;

public class HELLOFILE {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("Hello.txt"));
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}

	}

}
