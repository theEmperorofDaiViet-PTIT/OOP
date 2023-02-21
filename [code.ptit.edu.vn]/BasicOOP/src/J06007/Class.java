package J06007;
import java.util.*;
public class Class {
	
	Subject Sub;
	Professor Prof;
	double time;
	
	public void setProfessor(ArrayList<Professor> Prof, String profID) {
		for(int i = 0; i < Prof.size(); i++) {
			if(Prof.get(i).ID.compareTo(profID) == 0) {
				this.Prof = Prof.get(i);
				break;
			}
		}		
	}
	
	public void setSubject(ArrayList<Subject> Sub, String subID) {
		for(int i = 0; i < Sub.size(); i++) {
			if(Sub.get(i).ID.compareTo(subID) == 0) {
				this.Sub = Sub.get(i);
				break;
			}
		}		
	}
}
