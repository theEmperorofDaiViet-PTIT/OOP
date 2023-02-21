import java.util.*;
public class J04005_Thisinh {
	Scanner input = new Scanner(System.in);
	
	private String name = input.nextLine();
	private String dob = input.nextLine();
	private float score1 = input.nextFloat();
	private float score2 = input.nextFloat();
	private float score3 = input.nextFloat();
	private float totalScore = score1 + score2 + score3;
	
	public static void main(String[] args) {
		J04005_Thisinh candidate = new J04005_Thisinh();
		System.out.printf("%s %s %.1f",candidate.name, candidate.dob, candidate.totalScore);

	}

}
