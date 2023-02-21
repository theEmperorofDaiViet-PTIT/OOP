package J06007;

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
}
