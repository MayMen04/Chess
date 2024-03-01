import java.util.*;
public class Rook extends Piece{
	private int n;
	private int s;
	private int w;
	private int e;
	
	public Rook(String name, boolean color, int x, int y) {
		super(name, color, x, y);
		n = y;
		s = 7 - y;
		w = x;
		e = 7 - x;
	}	
	public void setPath() {			
		for(int i = 1; i < n; i++) {
			addPoint("n", getX(), getY() - i);
		}
		for(int i = 1; i < s; i++) {
			addPoint("s", getX(), getY() + i);
		}
		for(int i = 1; i < w; i++) {
			addPoint("w", getX() - i, getY());
		}
		for(int i = 1; i < e; i++) {
			addPoint("e", getX() + i, getY());
		}
	}		
	public String toString() {
		String s = "";
		for(int i = 0; i < getPath().size(); i++) {
			s += getPath().get(i) + "\n";
		}
		return s;
	}
}
