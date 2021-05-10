import java.awt.Color;

public class Pen extends Shape {
	// Constructor
	// X cord
	// Y cord
	// Color value
	public Pen(double _x, double _y, Color _c){
		super (_x, _y, _c);
	}
	
	// Draw pen at location
	public void draw(){
	  StdDraw.point(super.getX(), super.getY());
	}
	
	// Return info for saving to file
	public String save(){
	  return "pen " + super.getX() + " " + super.getY() + " " + super.getC();
	}
}