package codePTIT;
import java.util.*;
import java.math.*;
public class J01009_Tonggiaithua {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int n = input.nextInt();
		 BigInteger res = new BigInteger("0");
		 BigInteger fac = new BigInteger("1");
		 for(int i = 1; i <= n; i++) {
			 fac = fac.multiply(BigInteger.valueOf(i));
			 res = res.add(fac);
		 }
		 System.out.println(res);
	}

}
