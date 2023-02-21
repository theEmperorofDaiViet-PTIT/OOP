import java.util.*;
import java.io.*;
public class J07004_Sokhacnhau {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("DATA.in"));
		int a[] = new int[1000];
		while(input.hasNextInt()) {
			int i = input.nextInt();
			a[i]++;
		}
		for(int i = 0; i < 1000; i++) {
			if(a[i] > 0) {
				System.out.printf("%d %d\n", i, a[i]);
			}
		}
		input.close();
	}

}
