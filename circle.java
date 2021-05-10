import java.awt.Color;

class Circle extends Shape {
	// Constructor
	// X cord
	// Y cord
	// Color value
	// Radius
	public Circle(double _x, double _y, Color _c, double _r) {
		super(_x, _y, _c); 
		m_r = _r;
	}

	// Draw in scene
	public void draw() {
		StdDraw.circle(super.getX(), super.getY(), m_r);
	}
	
	// Write for saving
	public String save(){
		String save = "circle " + super.getX() + " " + super.getY() + " " + super.getC() + " " + m_r;
		return save;
	}

	private double m_r = 0; //< Radius
}