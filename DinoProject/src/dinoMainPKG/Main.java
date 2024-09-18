package dinoMainPKG;

import java.util.ArrayList;

import assets.StdTile;
import concreteTiles.Token;

public class Main {
	
	public static final boolean POWERWASH() {
		// Ensure only WASD
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAIN CALLED");
		
		/*
		 * 1. Get Input from user
		 * 2. Power wash
		 *	
		 */
		GameBoard newBoard = new GameBoard();
		ArrayList<ArrayList<StdTile>> MainBoard= new ArrayList<ArrayList<StdTile>>();
		
		MainBoard = newBoard.converter();
		
		newBoard.terminalRender(MainBoard);
		
		
		
		
		
		
		
	}
	
	
}
