import java.io.*;
import java.util.*;
public class J07015_Nguyento {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
		
		
		
		
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		ArrayList<Integer> arr = (ArrayList<Integer>)in.readObject();
		int[] a = new int[10000];
		for(Integer mem: arr) {
			if(checkPRIME(mem)) {
				a[mem]++;
			}
		}
		for(int i = 0; i < 10000; i++) {
			if(a[i] > 0)
				System.out.printf("%d %d\n", i, a[i]);
		}
		
	}
	
	public static boolean checkPRIME(int n) {
		if(n < 2)
			return false;
		if(n % 2 == 0) {
			if(n == 2)
				return true;
			else
				return false;
		}
		boolean check = true;
		for(int i = 3; i <= Math.sqrt(n); i+= 2) {
			if(n % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}

}
