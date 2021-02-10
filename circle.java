import java.awt.Color;

class Circle extends Shape {
	//StdDraw.circle(double x, double y, double radius)//
	
	
	public Circle(double _x, double _y, Color _c, double _r) {
		super(_x, _y, _c); 
		m_r = _r;
	}

	public void draw() {
		StdDraw.circle(super.getX(), super.getY(), m_r);
	}
	
	public String save(){
		String save = "circle " + super.getX() + " " + super.getY() + " " + super.getC() + " " + m_r;
		return save;
	}

	private double m_r = 0;
}