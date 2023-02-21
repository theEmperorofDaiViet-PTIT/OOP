import java.io.*;
public class J07005_Sokhacnhau {

	public static void main(String[] args) throws IOException{
		DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
		int[] arr = new int[1000];
		for(int i = 0; i < 100000; i++) {
			arr[in.readInt()]++;
		}		
		for(int j = 0; j < 1000; j++) {
			if(arr[j] > 0)
				System.out.println(j + " " + arr[j]);
			
		}
		in.close();
	}

}


