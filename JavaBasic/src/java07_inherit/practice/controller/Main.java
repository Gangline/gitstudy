package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Rectangle;

public class Main  {
	public static void main(String[] args) {
		
		Circle[] circle = new Circle[3];
		circle[0] = new Circle();
		circle[1] = new Circle(1,2,3);
		circle[2] = new Circle(24,23,25);
		
		for(int i=0; i<circle.length; i++) {
			circle[i].draw();
			System.out.println("----------------------");
		}
		
		Rectangle[] rectangle = new Rectangle[3];
		rectangle[0] = new Rectangle(1,2,3,4);
		rectangle[1] = new Rectangle(23,45,13,23);
		rectangle[2] = new Rectangle();
		
		for(int i=0; i<rectangle.length; i++) {
			rectangle[i].draw();
			System.out.println("----------------");
		}
		
	}
}
