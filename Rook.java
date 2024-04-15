
public class Rook extends Piece{
	public Rook(String name, boolean color, int x, int y) {
		super(name, color, x, y);
	}	
	public void setPath() {			
		for(int i = 1; i <= getN(); i++) {
			addPoint("n", getX(), getY() - i);
		}
		for(int i = 1; i <= getS(); i++) {
			addPoint("s", getX(), getY() + i);
		}
		for(int i = 1; i <= getW(); i++) {
			addPoint("w", getX() - i, getY());
		}
		for(int i = 1; i <= getE(); i++) {
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
