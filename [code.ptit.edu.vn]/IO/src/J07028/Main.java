package J07028;
import java.util.*;

import java.io.*;
public class Main {
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		Scanner input1 = new Scanner(new File("MONHOC.in"));
		int amountSubject = input1.nextInt();
		ArrayList<Subject> Sub = new ArrayList<>();
		for(int i = 0; i < amountSubject; i++) {
			Sub.add(new Subject());
			Sub.get(i).ID = input1.next();
			Sub.get(i).name = input1.nextLine();	
			Sub.get(i).name = Sub.get(i).name.trim();
		}
		Scanner input2 = new Scanner(new File("GIANGVIEN.in"));
		int amountProfessor = input2.nextInt();
		ArrayList<Professor> Prof = new ArrayList<>();
		for(int i = 0; i < amountProfessor; i++) {
			Prof.add(new Professor());
			Prof.get(i).ID = input2.next();
			Prof.get(i).name = input2.nextLine();
			Prof.get(i).name = Prof.get(i).name.trim();
		}
		Scanner input3 = new Scanner(new File("GIOCHUAN.in"));
		int amountClass = input3.nextInt();
		ArrayList<Class> Cla = new ArrayList<>();
		for(int i = 0; i < amountClass; i++) {
			Cla.add(new Class());
			Cla.get(i).setProfessor(Prof, input3.next());
			Cla.get(i).setSubject(Sub, input3.next());
			Cla.get(i).time = input3.nextDouble();
			Cla.get(i).getTime();
		}
		
		for(Professor prof: Prof) {
			prof.joinClass(Cla);
			prof.calculateTime();
		}
		
		
		for(Professor prof: Prof) {
			System.out.printf("%s %.2f", prof.name, prof.time);
			System.out.println();
		}
	}
}