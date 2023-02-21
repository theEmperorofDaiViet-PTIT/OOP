package J06008;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountSubject = input.nextInt();
		ArrayList<Subject> Sub = new ArrayList<>();
		for(int i = 0; i < amountSubject; i++) {
			Sub.add(new Subject());
			Sub.get(i).ID = input.next();
			Sub.get(i).name = input.nextLine();	
			Sub.get(i).name = Sub.get(i).name.trim();
		}
		int amountProfessor = input.nextInt();
		ArrayList<Professor> Prof = new ArrayList<>();
		for(int i = 0; i < amountProfessor; i++) {
			Prof.add(new Professor());
			Prof.get(i).ID = input.next();
			Prof.get(i).name = input.nextLine();
			Prof.get(i).name = Prof.get(i).name.trim();
		}
		int amountClass = input.nextInt();
		ArrayList<Class> Cla = new ArrayList<>();
		for(int i = 0; i < amountClass; i++) {
			Cla.add(new Class());
			Cla.get(i).setProfessor(Prof, input.next());
			Cla.get(i).setSubject(Sub, input.next());
			Cla.get(i).time = input.nextDouble();
			Cla.get(i).getTime();
		}
		
		for(Professor prof: Prof) {
			prof.joinClass(Cla);
			prof.calculateTime();
		}
		
		
		input.nextLine();
		Professor.getInfo(Prof, input.nextLine());
	}
}
