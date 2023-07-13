package java07_inherit.practice.model;

class Point {

	protected int x;
	protected int y;
	
	public Point() {

	}
	
	//x,y좌표값
	public void draw() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	
}
