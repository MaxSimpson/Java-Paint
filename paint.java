import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;
import java.util.ArrayList;

import java.awt.Color;

public class paint{

	public static void main (String args[]) throws FileNotFoundException{
		//StdDraw Setup
		StdDraw.setCanvasSize(1920,1080);
		StdDraw.setXscale(0.0, 1920.0);
    StdDraw.setYscale(1080.0, 0.0);	
		StdDraw.enableDoubleBuffering();
		
		ArrayList<shape> entities = new ArrayList<shape>(); //Makes ArrayList for all entities on canvas
		
		Scanner input = new Scanner(System.in);
		boolean go = true;
		Color c = StdDraw.BLACK; //Look in documentation file
		int tool = 0; //0=pen 1=circle
		int radius = 0;
		double size = 0.02; // Pen Size
		StdDraw.setPenRadius(size);
		
		while(go){
		
			// Check user input		
			if(StdDraw.hasNextMouseClicked()){
			 
				StdDraw.MouseClick m = StdDraw.nextMouseClicked();
				double x = m.getX();
				double y = m.getY();
			  
				if((y < 100) && (x > 1500) && (x < 1600)){
					PrintWriter printWriter = new PrintWriter("save.txt");//makes file
					
					for(shape i : entities) {
						printWriter.println(i.save());
					}
					printWriter.flush();
					System.exit(0);
				
				}else if(y > 90){
					if(tool == 0){//pen
					entities.add(new pen(m.getX(), m.getY(), c));
					}else if(tool == 1){//circle
						entities.add(new circle(m.getX(), m.getY(), c, 100));
						System.out.println("Made Circle");
				}
					
				}else if(x < 1095){
					c = draw.checkColors(x);
				}else if ((x > 1310) && (x < 1385)){
					tool = 1;
					System.out.println("Selected Circle");
				}else if ((x > 1100) && (x < 1170)){
					tool = 0;
					System.out.println("Selected Pen");
				}
			}
			
			// Do automated stuff
		
		  // Draw everything
			StdDraw.clear();
			
			//if(StdDraw.mousePressed())
			StdDraw.circle(StdDraw.mouseX(), StdDraw.mouseY(), 25);
			
			for(shape s : entities){
			  s.draw();
			}
			draw.ui();
			StdDraw.show();
			StdDraw.pause(5);
		}
	}
}

/*

*/
