
public class Knight extends Piece{
	private int n;
	private int s;
	private int w;
	private int e;	
	private int nw;
	private int ne;
	private int sw;
	private int se;	
	public Knight(String name, boolean color, int x, int y) {
		super(name, color, x, y);
		n = y;
		s = 7 - y;
		w = x;
		e = 7 - x;
		n = inBounds(n);
		s = inBounds(s);
		w = inBounds(w);
		e = inBounds(e);
	}
	public void setPath() {	
		for(int i = getY()-n; i <= getY()+s; i++) {
			for(int j = getX()-w; j <= getX()+e; j++) {
				if(i == getY()-n || i == getY()+s || j == getX()-w || j == getX()+e) {
					
					System.out.print("("+j+","+i+")");
				}
				else {
					System.out.print("     ");
				}
			}		
			System.out.println();
		}
	}	
	private int inBounds(int f1) {
		if(f1 >= 2) {
			return 2;
		}
		else if(f1 == 1) {
			return 1;
		}
		else {
			return 0;
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
