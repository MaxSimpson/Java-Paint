import java.awt.Color;

public class Pen extends Shape {
	public Pen(double _x, double _y, Color _c){
		super (_x, _y, _c);
	}
	
	public void draw(){
	  StdDraw.point(super.getX(), super.getY());
	}
	
	public String save(){
		String save = "pen " + super.getX() + " " + super.getY() + super.getC();
		return save;
	}
}