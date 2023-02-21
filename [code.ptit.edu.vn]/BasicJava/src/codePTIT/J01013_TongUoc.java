package codePTIT;
import java.util.*;
public class J01013_TongUoc {
	
	public static boolean checkPRIME[] = new boolean[2000004];
	public static int PRIMEnumbers[] = new int[200000];
	
	public static void Eratosthenes() {
		Arrays.fill(checkPRIME,true);
		checkPRIME[0] = false;
		checkPRIME[1] = false;
		int index = 0;
		for(int i = 2; i*i <= 2000000; i++) {
			if(checkPRIME[i] == true) {
				PRIMEnumbers[index] = i;
				index++;
				for(int j = i*i; j <= 2000000; j += i) {
					checkPRIME[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		long SUM = 0;
		Eratosthenes();
		while(test-->0) {
			int n = input.nextInt();
			if(checkPRIME[n] == true) {
				SUM += n;
				continue;
			}
			else {
				int index = 0;
				while(n != 1) {
					while(n % PRIMEnumbers[index] == 0) {
						SUM += PRIMEnumbers[index];
						n /= PRIMEnumbers[index];
					}
					if(checkPRIME[n] == true) {
						SUM += n;
						break;
					}
					index++;
					
				}
			}
		}
		input.close();
		System.out.println(SUM);
	}

}
