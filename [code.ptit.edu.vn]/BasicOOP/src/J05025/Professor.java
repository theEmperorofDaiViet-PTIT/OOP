package J05025;

public class Professor implements Comparable<Professor>{
	String ID = "GV";
	String name;
	String forename;
	String major;
	String majorID = "";
	
	public void getID(int i) {
		String tmp = "" + i;
		while(tmp.length() < 2)
			tmp = "0" + tmp;
		this.ID += tmp;
	}
	
	public void getForeName() {
		String[] Name = this.name.split(" ");
		this.forename = Name[Name.length - 1];
	}
	
	public void getMajorID() {
		String[] tmp = this.major.split(" ");
		for(String mem: tmp) {
			majorID += mem.substring(0,1).toUpperCase();
		}

	}
	
	@Override
	public int compareTo(Professor p) {
		if(this.forename.compareTo(p.forename) < 0)
			return -1;
		else if (this.forename.compareTo(p.forename) == 0)
			return 0;
		else
			return 1;
	}
}
