package J05062;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		int slot = input.nextInt();
		ArrayList<Student> Stu = new ArrayList<>();
		for(int i = 0; i < amount; i++) {
			input.nextLine();
			Stu.add(new Student(input.nextLine(), input.nextDouble(), input.nextInt()));
			Stu.get(i).examine();
		}
		ArrayList<Student> Stu2 = (ArrayList)Stu.clone();
		Collections.sort(Stu);
		if(slot < amount) {
			for(int i = slot; i < amount; i++) {
				if(Stu.get(i).getTBC() == Stu.get(i-1).getTBC()) {
					slot += 1;
				}
				else
					break;
			}
			for(int i = slot; i < amount; i++) {
				Stu.get(i).setStatus();
			}
		}
		
		for(Object s: Stu2) {
			System.out.print(s.toString());
		}
		
		input.close();
	}

}
