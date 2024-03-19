 
public class Bishop extends Piece{
	private int n;
	private int s;
	private int w;
	private int e;	
	private int nw;
	private int ne;
	private int sw;
	private int se;	
	public Bishop(String name, boolean color, int x, int y) {
		super(name, color, x, y);
		n = y;
		s = 7 - y;
		w = x;
		e = 7 - x;
		nw = inBounds(n, w);
		ne = inBounds(n, e);
		sw = inBounds(s, w);
		se = inBounds(s, e);
	}
	public void setPath() {			
		for(int i = 1; i <= nw; i++) {
			addPoint("nw", getX() - i, getY() - i);
		}
		for(int i = 1; i <= ne; i++) {
			addPoint("ne", getX() + i, getY() - i);
		}
		for(int i = 1; i <= sw; i++) {
			addPoint("sw", getX() - i, getY() + i);
		}
		for(int i = 1; i <= se; i++) {
			addPoint("se", getX() + i, getY() + i);
		}
	}		
	public String toString() {
		String s = "";
		for(int i = 0; i < getPath().size(); i++) {
			s += getPath().get(i) + "\n";
		}
		return s;
	}
	private int inBounds(int f1, int f2) {
		if(f1 < f2) {
			return f1;
		}
		else {
			return f2;
		}
	}
}

