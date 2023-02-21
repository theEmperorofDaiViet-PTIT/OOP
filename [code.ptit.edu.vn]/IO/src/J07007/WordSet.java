package J07007;
import java.io.*;
import java.util.*;
public class WordSet extends Object{
	
	String s;
	ArrayList<String> ws = new ArrayList<>();
	WordSet(){
	}
	
	
	WordSet(String s) throws IOException {
		this.s = s;
		Scanner in = new Scanner(new File(s));
		while(in.hasNext()) { 
			String tmp = in.next().toLowerCase();
			if(this.ws.contains(tmp) == false) {			
				this.ws.add(tmp);
			}
		}
		Collections.sort(ws);
	}
		
	@Override
	public String toString() {
		String S = "";
		for(int i = 0; i < ws.size(); i++) {
			S += ws.get(i) + "\n";
		}
		return S;
	}

}
