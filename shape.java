import java.awt.Color;

public abstract class Shape {

	private double x;
	private double y;
	private Color c;
	
	public Shape(double _x, double _y, Color _c){
		x = _x;
		y = _y;
		c = _c;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
	public Color getC(){
		return c;
	}
	public abstract void draw();
	
	public abstract String save();

}
