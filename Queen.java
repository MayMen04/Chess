
public class Queen extends Piece{
	public Queen(String name, boolean color, int x, int y) {
		super(name, color, x, y);
		setNw(inBounds(getN(), getW()));
		setNe(inBounds(getN(), getE()));
		setSw(inBounds(getS(), getW()));
		setSe(inBounds(getS(), getE()));
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
		for(int i = 1; i <= getNw(); i++) {
			addPoint("nw", getX() - i, getY() - i);
		}
		for(int i = 1; i <= getNe(); i++) {
			addPoint("ne", getX() + i, getY() - i);
		}
		for(int i = 1; i <= getSw(); i++) {
			addPoint("sw", getX() - i, getY() + i);
		}
		for(int i = 1; i <= getSe(); i++) {
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
}