import java.util.ArrayList;
public class Piece {
	private String name;
	private boolean color;
	private int y;
	private int x;
	ArrayList<Integer> listY = new ArrayList<Integer>();
	ArrayList<Integer> listX = new ArrayList<Integer>();
	public Piece(String name, boolean color, int y, int x) {
		this.name = name;
		this.color = color;
		this.y = y;
		this.x = x;
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
