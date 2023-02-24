package NguyenTo;
import java.util.*;
public class Capso {
	int v1;
	int v2;
	Capso(int V1, int V2){
		this.v1 = V1;
		this.v2 = V2;
	}
	
	public static void sort(Capso[] p) {
		for(int i = 1; i < p.length; i++) {
			Capso tmp = p[i];
			int j;
			for(j = i - 1; j >= 0; j--) {
				if(p[j].v1 > tmp.v1) {
					p[j+1] = p[j];
				}
				else
					break;
			}
			p[j+1] = tmp;
			
		}
	}
}
