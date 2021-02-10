import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.awt.Color;
public class Draw {
	
	public static void ui()throws FileNotFoundException {
		
		StdDraw.picture(960.0, 60.0, "ui.png");
		StdDraw.textLeft(1830, 1030, "X: " + StdDraw.mouseX());
		StdDraw.textLeft(1830, 1000, "Y: " + StdDraw.mouseY());
		StdDraw.picture(1550, 65, "save.png");
	}
	public static Color checkColors(double x) {
					Color c = StdDraw.BLACK;
					if(x < 1091 && !(x < 1010)){
						c = StdDraw.WHITE;
						StdDraw.setPenColor(StdDraw.WHITE);
						
					}else if(x < 1010 && !(x < 910)){
						c = StdDraw.BLACK;
						StdDraw.setPenColor(StdDraw.BLACK);
						
					}else if(x < 910 && !(x < 810)){
						c = StdDraw.GRAY;
						StdDraw.setPenColor(StdDraw.GRAY);
						
					}else if(x < 810 && !(x < 710)){
						c = StdDraw.MAGENTA;
						StdDraw.setPenColor(StdDraw.MAGENTA);
						
					}else if(x < 710 && !(x < 610)){
						c = StdDraw.PINK;
						StdDraw.setPenColor(StdDraw.PINK);
						
					}else if(x < 610 && !(x < 510)){
						c = StdDraw.BLUE;
						StdDraw.setPenColor(StdDraw.BLUE);
						
					}else if(x < 510 && !(x < 410)){
						c = StdDraw.CYAN;
						StdDraw.setPenColor(StdDraw.CYAN);
						
					}else if(x < 410 && !(x < 310)){
						c = StdDraw.GREEN;
						StdDraw.setPenColor(StdDraw.GREEN);
						
					}else if(x < 310 && !(x < 210)){
						c = StdDraw.YELLOW;
						StdDraw.setPenColor(StdDraw.YELLOW);
						
					}else if(x < 210 && !(x < 110)){
						c = StdDraw.ORANGE;
						StdDraw.setPenColor(StdDraw.ORANGE);
						
					}else if(x < 110){
						c = StdDraw.RED;
						StdDraw.setPenColor(StdDraw.RED);
						
					}
					return c;
	}
	/*
//BLACK	//BLUE	//CYAN		//GRAY	//GREEN		//MAGENTA	//ORANGE	//PINK	//RED	//WHITE	//YELLOW
*/
}