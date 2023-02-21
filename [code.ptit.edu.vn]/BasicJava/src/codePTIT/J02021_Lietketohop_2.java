package codePTIT;
import java.util.*;
public class J02021_Lietketohop_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int[] s = new int[K + 1];
		for(int i = 1; i <= K; i++)
			s[i] = i;
		int count = 1;
		boolean ok = true;
		while(ok) {
			for(int k = 1; k <= K; k++) {
				System.out.print(s[k]);
			}
			System.out.print(" ");
			int i = K;
			for( ; i > 0 && s[i] ==  N- K + i; i--){
			}
			if(i>0){
				s[i]++;
				for(int j=i+1;j<=K;j++)
					s[j] =s[i] + j - i;
				count++;
			}
			else
				ok = false;
		}
		System.out.println();
		System.out.println("Tong cong co " + count + " to hop");		


	}

}
