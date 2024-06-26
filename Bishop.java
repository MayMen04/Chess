 
public class Bishop extends Piece{
	public Bishop(String name, boolean color, int x, int y) {
		super(name, color, x, y);	
		setNw(inBounds(getN(), getW()));
		setNe(inBounds(getN(), getE()));
		setSw(inBounds(getS(), getW()));
		setSe(inBounds(getS(), getE()));
	}
	public void setPath() {			
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

