package J05080;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		input.nextLine();
		ArrayList<Class> Cla = new ArrayList<>();
		Set<Subject> Sub = new HashSet<>();
		Set<Professor> Prof = new HashSet<>();
		for(int i = 0; i < amount; i++) {
			Cla.add(new Class());
			Subject newSub = new Subject(input.nextLine(), input.nextLine());
			Sub.add(newSub);
			Cla.get(i).setSubject(newSub);
			Cla.get(i).setID(input.nextLine());
			Professor newProf = new Professor(input.nextLine());
			Prof.add(newProf);
			Cla.get(i).setProfessor(newProf);
		}
		int queryAmount = input.nextInt();
		
		input.nextLine();
		for(int i = 0; i < queryAmount; i++) {
			String query = input.nextLine();
			ArrayList<Class> Que = new ArrayList<>();
			System.out.printf("Danh sach cho giang vien %s:\n", query);
			for(Class mem: Cla) {
				if(mem.getProfessor().getName().compareTo(query) == 0) {
					Que.add(mem);
				}
			}
			Collections.sort(Que);
			for(Class mem: Que) {
				System.out.print(mem.toString());
			}
		}
		
		input.close();
	}

}
