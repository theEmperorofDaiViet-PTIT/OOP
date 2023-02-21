package J07028;
import java.util.ArrayList;
public class Professor {
	String ID;
	String name;
	double time = 0;
	ArrayList<Class> Cla = new ArrayList<>();
	
	public void joinClass(ArrayList<Class> Cla) {
		for(int i = 0; i <  Cla.size(); i++) {
			if(Cla.get(i).Prof.ID.compareTo(this.ID) == 0) {
				this.Cla.add(Cla.get(i));
			}
		}		
	}
	
	public void calculateTime() {
		for(int i = 0; i <  this.Cla.size(); i++) {
			this.time += this.Cla.get(i).time;
		}
	}
	
	public static void getInfo(ArrayList<Professor> Prof, String profID) {
		for(int i = 0; i < Prof.size(); i++) {
			if(Prof.get(i).ID.compareTo(profID) == 0) {
				System.out.printf("%s %s\n","Giang vien:", Prof.get(i).name);
				for(int j = 0; j < Prof.get(i).Cla.size(); j++) {
					System.out.printf("%s %s\n",Prof.get(i).Cla.get(j).Sub.name , Prof.get(i).Cla.get(j).Time);
				}
				System.out.printf("%s %.2f","Tong:", Prof.get(i).time);
			}
		}
	}
}