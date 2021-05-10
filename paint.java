import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;
import java.util.ArrayList;

import java.awt.Color;

public class Paint {

	public static void main (String args[]) throws FileNotFoundException {
		// StdDraw Setup
		StdDraw.setCanvasSize(1920, 1080);
		StdDraw.setXscale(0.0, 1920.0);
    StdDraw.setYscale(1080.0, 0.0);	
		StdDraw.enableDoubleBuffering();
		
		// Makes ArrayList for all entities on canvas
		ArrayList<Shape> entities = new ArrayList<Shape>(); 
		
		boolean go = true;
		Color c = StdDraw.BLACK; // Look in documentation file
		int tool = 0; // 0=pen 1=circle
		int radius = 0;
		double size = 0.02; // Pen Size
		StdDraw.setPenRadius(size);
		
		while(go) {
		
			// Check user input		
			if(StdDraw.hasNextMouseClicked()) {
			 
				StdDraw.MouseClick m = StdDraw.nextMouseClicked();
				double x = m.getX();
				double y = m.getY();
			  
				if((y < 100) && (x > 1500) && (x < 1600)) {
					PrintWriter printWriter = new PrintWriter("save.txt"); //Makes file
					
					for(Shape i : entities) {
						printWriter.println(i.save());
					}
					printWriter.flush();
					System.exit(0);
				
				} else if(y > 90) {
					if(tool == 0) { // Pen
					entities.add(new Pen(m.getX(), m.getY(), c));
					} else if(tool == 1) { // Circle
						entities.add(new Circle(m.getX(), m.getY(), c, 100));
					}
				} else if(x < 1095) {
					c = Draw.checkColors(x);
				} else if ((x > 1310) && (x < 1385)) {
					tool = 1;
				} else if ((x > 1100) && (x < 1170)) {
					tool = 0;
				}
			}
			
			// Do automated stuff
		
		  // Draw everything
			StdDraw.clear();
			
			//if(StdDraw.mousePressed())
			StdDraw.circle(StdDraw.mouseX(), StdDraw.mouseY(), 25);
			
			for(Shape s : entities){
			  s.draw();
			}
			Draw.ui();
			StdDraw.show();
			// StdDraw.pause(5);
		}
	}
}
