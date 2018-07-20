import java.awt.Color;

public abstract class shape {

	private double x;
	private double y;
	private Color c;
	
	public shape(double _x, double _y, Color _c){
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
