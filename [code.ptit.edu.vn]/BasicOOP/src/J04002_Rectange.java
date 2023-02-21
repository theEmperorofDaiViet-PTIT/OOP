import java.util.*;
public class J04002_Rectange {
	
	private double width;
	private double height;
	private String color;
	
	J04002_Rectange(){
		width = 1;
		height = 1;
	}
	
	J04002_Rectange(double newWidth, double newHeight, String newColor){
		width = newWidth;
		height = newHeight;
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public double findArea() {
		return width * height;
	}
	
	public double findPerimeter() {
		return 2 * (width + height);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		J04002_Rectange Rec = new J04002_Rectange();
		Rec.width = input.nextDouble();
		Rec.height = input.nextDouble();
		Rec.color = input.next();
		
		String Color = "";
		Color += Rec.color.substring(0,1).toUpperCase();
		Color += Rec.color.substring(1,Rec.color.length()).toLowerCase();
		
		if(Rec.width <= 0 || Rec.height <= 0) {
			System.out.print("INVALID");
		}
		else
			System.out.printf("%.0f %.0f %s", Rec.findPerimeter(), Rec.findArea(), Color);
		input.close();
	}

}
