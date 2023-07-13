package test2;

public class Circle extends Point{
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void draw() {
		System.out.print("중심점 : ");
		super.draw();
	
		System.out.print("면적 : ");
		System.out.printf("%.1f", Math.PI * radius * radius);
		System.out.println();
		System.out.print("둘레 :");
		System.out.printf("%.1f", 2 * Math.PI * radius);
		System.out.println();
		System.out.println("-------------------");
	}
		
	
	
	
}
