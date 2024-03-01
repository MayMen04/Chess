import java.util.*;
public class Driver {
	public static void main(String[] args) {
		ArrayList<Piece> piece = new ArrayList<Piece>();
		piece.add(new Rook("wrk1", true, 0, 0));
		piece.add(new Rook("wrk2", true, 0, 3));
		
		piece.get(0).setPath();
		piece.get(1).setPath();
		
		
	}
}