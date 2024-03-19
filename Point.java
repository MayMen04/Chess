
public class Point {
	private String direction;
	private int x;
	private int y;
	public Point(int x, int y) {
		direction = "unknown";
		this.y = y;
		this.x = x;
	}
	public Point(String direction, int x, int y) {
		this.direction = direction;
		this.y = y;
		this.x = x;
	}
	public String getDirection() {
		return direction;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}
		return false;
	}
	public String toString() {
		String s = String.format("(%d, %d)", x, y);
		return s;
	}
}
