package J07010;

public class Student {
	
	String ID = "";
	String name;
	String dob;
	String DOB = "";
	String Class;
	double GPA;
	
	public void getID(int i) {
		ID += i;
		while(this.ID.length() < 3)
			ID = "0" + ID;
		ID = "B20DCCN" + ID;
	}
	
	public void getDOB() {
		String[] s = this.dob.split("/");
		for(int i = 0; i < 3; i++) {
			if(i < 2) {				
				while(s[i].length() < 2)
					s[i] = "0" + s[i];
				this.DOB += s[i] + "/";
			}
			if(i == 2) {
				while(s[i].length() < 4)
					s[i] = "0" + s[i];
				this.DOB += s[i];
			}
		}
	}
}
