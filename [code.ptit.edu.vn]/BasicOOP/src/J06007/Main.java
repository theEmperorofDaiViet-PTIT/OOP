package J06007;
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
