import java.util.ArrayList;
public abstract class Piece {
	private String name;
	private boolean color;
	private int y;
	private int x;
	private ArrayList<Point> path = new ArrayList<Point>();
	public Piece(String name, boolean color, int x, int y) {
		this.name = name;
		this.color = color;
		this.x = x;
		this.y = y;	
	}
	public abstract void setPath();
	public void addPoint(String direction, int x, int y) {
		path.add(new Point(direction, x, y));
	}
	public Point getPathIndex(int i) {
		return path.get(i);
	}
	public ArrayList<Point> getPath(){
		return path;
	}
	public void setPath(ArrayList<Point> path) {
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
}
