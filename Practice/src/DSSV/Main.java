package DSSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Main {

		
		public static void main(String[] args) throws FileNotFoundException{
			Scanner in = new Scanner(new File("SINHVIEN.in"));
			int amountStu = in.nextInt();

			ArrayList<Student> Stu = new ArrayList<>();
			in.nextLine();
			for(int i = 0; i < amountStu; i++) {
				Stu.add(new Student());
				Stu.get(i).ID = in.nextLine();
				Stu.get(i).getName(in.nextLine());
				Stu.get(i).Class = in.nextLine();
				Stu.get(i).email = in.nextLine();
			}
			Collections.sort(Stu);
			for(int i = 0; i < Stu.size(); i++) {
				System.out.printf("%s %s %s %s\n", Stu.get(i).ID, Stu.get(i).name, Stu.get(i).Class, Stu.get(i).email);
			}

		}

}

