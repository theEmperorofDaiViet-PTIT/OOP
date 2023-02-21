package J05057;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		ArrayList<Candidate> S = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			input.nextLine();
			S.add(new Candidate(input.nextLine(), input.nextLine(), 
					input.nextDouble(),	input.nextDouble(), input.nextDouble())); 
		}
		for(Candidate stu: S) {
			System.out.printf("%s %s", stu.ID, stu.name);
			if(stu.bonus() == (int)stu.bonus())
				System.out.printf(" %d",(int)stu.bonus());
			else
				System.out.printf(" %.1f",stu.bonus());
			if(stu.total() == (int)stu.total())
				System.out.printf(" %d %s\n",(int)stu.total(), stu.result());
			else
				System.out.printf(" %.1f %s\n",stu.total(), stu.result());
		}
		
		
		
		
		
		input.close();
	}
}
