package J05029;
import java.util.*;
public class Corp implements Comparable<Corp>{
	String ID;
	String name;
	int amountIntern;
	
	public static void Query(ArrayList<Corp> Cor, int a, int b) {
		System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
		for(Corp mem: Cor) {
			if(mem.amountIntern >= a && mem.amountIntern <= b) {
				System.out.printf("%s %s %d\n", mem.ID, mem.name, mem.amountIntern);
			}			
		}
	}
	
	@Override
	public int compareTo(Corp c) {
		if(this.amountIntern > c.amountIntern)
			return -1;
		else if(this.amountIntern == c.amountIntern) {
			if(this.ID.compareTo(c.ID) < 0)
				return -1;
			else if(this.ID.compareTo(c .ID) == 0)
				return 0;
			else
				return 1;
		}
		else
			return 1;
	}
	
	
}
