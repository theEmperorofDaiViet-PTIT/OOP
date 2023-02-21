package J05080;

public class Class implements Comparable<Class>{
	private String ID;
	private Subject sub;
	private Professor prof;
	
	Class(){
	}
	
	public Subject getSubject() {
		return this.sub;
	}
	
	public void setSubject(Subject sub) {
		this.sub = sub;
	}
	
	public void setID(String ID){
		this.ID = ID;
	}
	
	public Professor getProfessor() {
		return this.prof;
	}
	public void setProfessor(Professor X) {
		this.prof = X;
	}
	
	@Override
	public int compareTo(Class c) {
		if(this.sub.getID().compareTo(c.sub.getID()) < 0)
			return -1;
		else if(this.sub.getID().compareTo(c.sub.getID()) == 0) {
			if(this.ID.compareTo(c.ID) < 0)
				return -1;
			else if(this.ID.compareTo(c.ID) == 0)
				return 0;
			else
				return 1;
		}
		else
			return 1;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s \n", this.sub.getID(), this.sub.getName(), this.ID);
	}
}