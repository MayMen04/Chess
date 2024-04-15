import java.util.ArrayList;
public abstract class Piece {
	private String name;
	private boolean color;
	private Point position;
	private int n;
	private int s;
	private int w;
	private int e;
	private int nw;
	private int ne;
	private int sw;
	private int se;	
	private ArrayList<Point> path = new ArrayList<Point>();
	public Piece(String name, boolean color, int x, int y) {
		this.name = name;
		this.color = color;
		position = new Point(x, y);	
		n = y;
		s = 7 - y;
		w = x;
		e = 7 - x;
	}
	public abstract void setPath();
	public void addPoint(int x, int y) {
		path.add(new Point(x, y));
	}
	public void addPoint(String direction, int x, int y) {
		path.add(new Point(direction, x, y));
	}
	public int inBounds(int f1, int f2) {
		if(f1 < f2) {
			return f1;
		}
		else {
			return f2;
		}
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
	public int getN() {
		return n;
	}
	public int getS() {
		return s;
	}
	public int getW() {
		return w;
	}
	public int getE() {
		return e;
	}
	public int getNw() {
		return nw;
	}
	public int getNe() {
		return ne;
	}
	public int getSw() {
		return sw;
	}
	public int getSe() {
		return se;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void setS(int s) {
		this.s = s;
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setE(int e) {
		this.e = e;
	}
	public void setNw(int nw) {
		this.nw = nw;
	}
	public void setNe(int ne) {
		this.ne = ne;
	}
	public void setSw(int sw) {
		this.sw = sw;
	}
	public void setSe(int se) {
		this.se = se;
	}
}
