import java.util.*;
public class Driver {
	public static void main(String[] args) {
		ArrayList<Piece> piece = new ArrayList<Piece>();
		piece.add(new Knight("knight", false, 6, 6));		
		Piece kt1 = piece.get(0);
		
		kt1.setPath();
		//System.out.println(kt1.getPosition());
		String direction = "";
		for(int i = 0; i < kt1.getPath().size(); i++) {
			//System.out.println(kt1.getPathIndex(i));
		}		
	}	
}