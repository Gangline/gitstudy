package java07_inherit.practice.model;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.height = height;
		this.width = width;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void draw() {
		System.out.println("좌표값 : ");
		super.draw();
		
		System.out.printf("면적 : %.1f",  (double)width * height);
		System.out.println();
	
		System.out.printf("둘레 : %.1f", 2 * ((double)width + height));
		System.out.println();
		
	}
	
	
}
