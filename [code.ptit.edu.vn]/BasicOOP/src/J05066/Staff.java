package J05066;

public class Staff implements Comparable<Staff>{
	private String name;
	private String ID;
	private String role;
	private String salaryIndex;
	private String IDno;
	
	Staff(String ID, String name){
		this.ID = ID;
		this.name = name.trim();
		this.role = ID.substring(0, 2);
		this.salaryIndex = ID.substring(2, 4);
		this.IDno = ID.substring(4);
	}
	
	public String getID() {
		return this.role;
	}
	
	public int getIDno() {
		return Integer.parseInt(this.IDno);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void fixID() {
		String tmp = this.ID;
		this.ID = "NV" + tmp.substring(2);
		this.role = "NV";
	}
	
	@Override
	public int compareTo(Staff s) {
		if(this.salaryIndex.compareTo(s.salaryIndex) < 0)
			return 1;
		else if(this.salaryIndex.compareTo(s.salaryIndex) == 0) {
			if(this.IDno.compareTo(s.IDno) < 0)
				return -1;
			else
				return 1;			
		}
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.role + " " + this.IDno + " " + this.salaryIndex + "\n";
	}
}
