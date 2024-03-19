import java.util.ArrayList;
public abstract class Piece {
	private String name;
	private boolean color;
	private Point position;
	private ArrayList<Point> path = new ArrayList<Point>();
	public Piece(String name, boolean color, int x, int y) {
		this.name = name;
		this.color = color;
		position = new Point(x, y);	
	}
	public abstract void setPath();
	public void addPoint(int x, int y) {
		path.add(new Point(x, y));
	}
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
		return position.getY();
	}
	public void setY(int y) {
		position.setY(y);
	}
	public int getX() {
		return position.getX();
	}	
	public void setX(int x) {
		position.setX(x);
	}
	public Point getPosition() {
		return position;
	}
}
