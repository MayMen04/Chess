
public class Knight extends Piece {
	public Knight(String name, boolean color, int x, int y) {
		super(name, color, x, y);
		setN(inBounds(getN()));
		setS(inBounds(getS()));
		setW(inBounds(getW()));
		setE(inBounds(getE()));
	}
	public void setPath() {	
		for(int i = getY()-getN(); i <= getY()+getS(); i++) {
			for(int j = getX()-getW(); j <= getX()+getE(); j++) {
				if(i == getY()-2 || i == getY()+2 || j == getX()-2 || j == getX()+2) {
					if(getX()%2==0&&getY()%2==0||getX()%2==1&&getY()%2==1) {
						if(i%2==0&&j%2==1) {	
							addPoint(j, i);						
						}
						else if(i%2==1&&j%2==0) {
							addPoint(j, i);	
						}
					}
					else if(getX()%2==1&&getY()%2==0||getX()%2==0&&getY()%2==1) {
						if(i%2==1&&j%2==1) {
							addPoint(j, i);		
						}
						else if(i%2==0&&j%2==0) {
							addPoint(j, i);	
						}
					}						
				}
			}		
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
