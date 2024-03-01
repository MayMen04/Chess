
public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.y = y;
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String toString() {
		String s = String.format("(%d, %d)", x, y);
		return s;
	}
}
