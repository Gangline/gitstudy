package test3;

import test2.Circle;
import test2.Rectangle;
import test2.Point;

public class Main {
	public static void main(String[] args) {
		
		Circle[] circles = new Circle[3];
		circles[0] = new Circle(1,2,3);
		circles[1] = new Circle();
		circles[2] = new Circle(2,3,4);
		
		for(int i=0; i<circles.length; i++) {
			circles[i].draw();
		}
		
		Rectangle[] recs = new Rectangle[3];
		recs[0] = new Rectangle(2,4,6,8);
		recs[1] = new Rectangle(3,6,9,12);
		recs[2] = new Rectangle();
		
		for(int i=0; i<recs.length; i++) {
			recs[i].draw();
		}
		
		
		Point[] po = new Point[5];
		po[0] = new Point(1,2);
		po[1] = new Circle(1,2,3);
		po[2] = new Point(1,2);
		po[3] = new Rectangle(1,2,3,4);
		po[4] = new Point(1,2);
		
		for(int i=0; i<po.length; i++) {
			po[i].draw();
			
		}
		
		
	}
}
