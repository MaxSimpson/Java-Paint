import java.awt.Color;

class circle extends shape{
	//StdDraw.circle(double x, double y, double radius)//
	private double r = 0;
	
	public circle(double _x, double _y, Color _c, double _r){
		super(_x, _y, _c); 
		r = _r;
	}
	public void draw(){
		StdDraw.circle(super.getX, super.getY, r);
	}
	
	public String save(){
		String save = "circle " + super.getX() + " " + super.getY() + " " + super.getC() + " " + r;
		return save;
	}
	
	
}