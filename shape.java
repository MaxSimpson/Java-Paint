import java.awt.Color;

public abstract class Shape {
	// Constructor
	// X cord
	// Y cord
	// Color 
	public Shape(double _x, double _y, Color _c){
		x = _x;
		y = _y;
		c = _c;
	}

	// Return x
	public double getX(){
		return x;
	}
	// Return y
	public double getY(){
		return y;
	}
	// Return color
	public Color getC(){
		return c;
	}

	// Draw
	public abstract void draw();
	
	// Save
	public abstract String save();

	private double x; //< X cord
	private double y; //< Y cord
	private Color c; //< Color
}
