package J05028;

public class Corp implements Comparable<Corp>{
	String ID;
	String name;
	int amountIntern;
	
	@Override
	public int compareTo(Corp c) {
		if(this.amountIntern > c.amountIntern)
			return -1;
		else if(this.amountIntern == c.amountIntern) {
			if(this.ID.compareTo(c.ID) < 0)
				return -1;
			else if(this.ID.compareTo(c .ID) == 0)
				return 0;
			else
				return 1;
		}
		else
			return 1;
	}
	
}
