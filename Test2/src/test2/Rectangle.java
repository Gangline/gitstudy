package test2;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
		
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
		System.out.println("좌표 : " + x + ", " + y);
		
		System.out.printf("면적 : " + "%.1f", width * (double)height);
		System.out.println();
		System.out.printf("둘레 : " + "%.1f" ,2 * (width + (double)height));
		System.out.println();
		System.out.println("---------------------------");
	}
	
	
	
}
