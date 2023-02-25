package J3;
import java.util.*;
public class Thi implements Comparable<Thi>{
	private Subject sub;
	private Ca ca;
	private String Class;
	private int Students;
	
	public Subject getSub() {
		return this.sub;
	}
	
	public void setSub(String name, ArrayList<Subject> Sub) {
		for(Subject mem: Sub) {
			if(name.compareTo(mem.getID()) == 0) {
				this.sub = mem;
				break;
			}
		}
	}
	
	public Ca getCa() {
		return this.ca;
	}
	
	public void setCa(String name, ArrayList<Ca> C) {
		for(Ca mem: C) {
			if(name.compareTo(mem.getID()) == 0) {
				this.ca = mem;
				break;
			}
		}
	}
	
	public String getclass() {
		return this.Class;
	}
	
	public void setClass(int Class) {
		this.Class = String.format("%02d", Class);
	}
	
	public int getStu() {
		return this.Students;
	}
	
	public void setStu(int Students) {
		this.Students = Students;
	}
	
	@Override
	public int compareTo(Thi t) {
		if(this.ca.compareTo(t.ca) < 0)
			return -1;
		else
			return 1;
	}
	
}
