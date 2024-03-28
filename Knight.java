
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
		System.out.println((getX()+e)-(getX()-w));
		System.out.println((getY()+s)-(getY()-n));
		System.out.println(getY());
		for(int i = getY()-n; i <= getY()+s; i++) {
			for(int j = getX()-w; j <= getX()+e; j++) {
				if(i == getY()-2 || i == getY()+2 || j == getX()-2 || j == getX()+2) {
					//System.out.print("("+j+","+i+")");
					if(((getY()+s)-(getY()-n))%2==0) {
						if(((getX()+e)-(getX()-w))%2==0) {
							if(i%2==1||i%2==0&&j%2==1) {
								System.out.print("("+j+","+i+")");
							}
							else {
								System.out.print("     ");
							}
						}	
						if(((getX()+e)-(getX()-w))%2==1) {
							if(i%2==1||i%2==0&&j%2==0) {
								System.out.print("("+j+","+i+")");
							}
							else {
								System.out.print("     ");
							}
						}	
					}
					else if(((getY()+s)-(getY()-n))%2==1) {
						if(((getX()+e)-(getX()-w))%2==0) {
							if(i%2==0||i%2==1&&j%2==1) {
								System.out.print("("+j+","+i+")");
							}
							else {
								System.out.print("     ");
							}
						}	
						if(((getX()+e)-(getX()-w))%2==1) {
							if(i%2==0||i%2==1&&j%2==0) {
								System.out.print("("+j+","+i+")");
							}
							else {
								System.out.print("     ");
							}
						}	
					}
					else {
						System.out.print("     ");
					}								
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
