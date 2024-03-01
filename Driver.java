import java.util.*;
public class Driver {
	public static void main(String[] args) {
		ArrayList<Piece> piece = new ArrayList<Piece>();
		piece.add(new Rook("wrk1", true, 0, 0));
		piece.add(new Rook("wrk2", true, 0, 3));
		
		Piece rk1 = piece.get(0);
		Piece rk2 = piece.get(1);
		
		rk1.setPath();
		rk2.setPath();
		
		String direction = "";
		
		for(int i = 0; i < rk1.getPath().size(); i++) {
			System.out.println(rk1.getPathIndex(i));
			for(int j = 0; j < rk2.getPath().size(); j++) {
				
				if(rk1.getPathIndex(i).getDirection() == direction) {
					//System.out.println(rk1.getPathIndex(i)+" - removed");
					continue;
				}
				if(rk1.getPathIndex(i).equals(rk2.getPathIndex(j))) {
					direction = rk1.getPathIndex(i).getDirection();
					System.out.println(direction);
				}
			}
		}
	}	
}