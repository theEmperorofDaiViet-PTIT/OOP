package Quanlikhachsan;
import java.util.*;

public class Guest {
	
	String ID = "KH";
	String name;
	String roomID;
	Calendar dateIn = Calendar.getInstance();
	Calendar dateOut = Calendar.getInstance();
	
	
	public void getID(int i) {
		String id = "" + i;
		while(id.length() < 2)
			id = "0" + id;
		this.ID += id;
	}
}
