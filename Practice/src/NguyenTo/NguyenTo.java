package NguyenTo;

import java.io.*;
import java.util.*;
public class NguyenTo {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
			
				
		ObjectInputStream in1 = new ObjectInputStream(new FileInputStream ("DATA1.in"));
		ArrayList<Integer> a = (ArrayList<Integer>)in1.readObject();
		ObjectInputStream in2 = new ObjectInputStream(new FileInputStream ("DATA2.in"));
		ArrayList<Integer> b = (ArrayList<Integer>)in2.readObject();
		ArrayList<Capso> p = new ArrayList<>();
		
		for(int i = 0; i < a.size(); i++) {
			if((NguyenTo.checkPRIME(a.get(i)) == true) && !(b.contains(a.get(i)))) {
				for(int j = i+1 ; j < a.size(); j++) {
					if((NguyenTo.checkPRIME(a.get(j)) == true) && !(b.contains(a.get(j)))) {
						if(a.get(i) + a.get(j) == 1000000) {
							p.add(new Capso(a.get(i), a.get(j)));
						}
						
						
						
					}
				}
			}
		}
		Capso[] P = (Capso[]) p.toArray();
		Capso.sort(P);
		for(int i = 0; i < p.size(); i++) {
			System.out.printf("%d %d\n", p.get(i).v1, p.get(i).v2);
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
		for(int i = 3; i <= Math.sqrt(n); i+=2) {
			if(n % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}
}
