/**
 * 
 */
package dinoMainPKG;

import java.util.*;

import assets.StdTile;
import concreteTiles.*;

import assets.*;
/**
 * 
 */

@SuppressWarnings("unused")
public class GameBoard {
	private static final String fileStorage = "PlaceHolderFileName";
	public ArrayList<ArrayList<StdTile>> pGame= new ArrayList<ArrayList<StdTile>>();
	
	/**
	 * The parameterized constructor for when there is <br>
	 * a file involved. 
	 * 
	 * @param levelNum
	 */
	public GameBoard(int levelNum) {
		super();
		// Initalizing pGameArray
		int _gameHeight = -1;
		char[][] _pGameArray = setGameArrayBoardFromSrc(levelNum);
		_gameHeight = _pGameArray.length;
		for(int i = 0; i < _gameHeight; i++)  {
			this.pGame.add(new ArrayList<StdTile>());
		}
		
		
		StdTile _tObjIter = null;
		for (int i = 0; i < pGame.size(); i++) {
			for (int k=0; k<_pGameArray[i].length; k++){
				if(_pGameArray[i][k]== '#') {
										
				}
				else if(_pGameArray[i][k]== '@') {
					
				}
				else if(_pGameArray[i][k]== '*') {
					
				}
				else if(_pGameArray[i][k]== 'B') {
					
				}
				else if(_pGameArray[i][k]== ' ') {
					
				}	
				else if(_pGameArray[i][k]== 'S') {
					
				}
				else if(_pGameArray[i][k]== 'E'){
					
				}
				else if(_pGameArray[i][k]== 'Ø') {
					
				}
				else if(_pGameArray[i][k]== '?') {
					
				}
				else {
					
				}
			}
		}
		//End Outer For
	}
	
	public GameBoard(char[][] InStuf) {
		super();
		// Initalizing pGameArray
		int _gameHeight = -1;
		char[][] _pGameArray = InStuf;
		_gameHeight = _pGameArray.length;
		
		for(int i = 0; i < _gameHeight; i++)  {
			this.pGame.add(new ArrayList<StdTile>());
		}
		
		for (int i = 0; i < pGame.size(); i++) {
			for (int k=0; k<_pGameArray[i].length; k++){
				// ~ ~ ~ Static Tile Initalization ~ ~ ~ //
				if(_pGameArray[i][k]== '#') {
					this.pGame.get(i).add(new Wall(i,k));
				}
				else if(_pGameArray[i][k]== ' ') {
					this.pGame.get(i).add(new Air(i,k));
				}
				else if(_pGameArray[i][k]== '*') {
					this.pGame.get(i).add(new PressurePlate(i,k));
				}
				else if(_pGameArray[i][k]== '°') {
					this.pGame.get(i).add(new Token(i,k));
				}
				else if(_pGameArray[i][k]== 's') {
					this.pGame.get(i).add(new Start(i,k));
				}	
				else if(_pGameArray[i][k]== 'e') {
					this.pGame.get(i).add(new End(i,k));
				}
				
				
				// ~ ~ ~ Entity Tile Initalization ~ ~ ~ //
				else if(_pGameArray[i][k]== '&'){
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else if(_pGameArray[i][k]== '■'){
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else if(_pGameArray[i][k]== 'Ø') {
					this.pGame.get(i).add(new Wall(i,k,'Ø'));
				}
				else if(_pGameArray[i][k]== '?') {
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else {
					
				}
			}
		}
		//End Outer For
	}
	
	
	/**
	 * Used for Hand implementing levels
	 */
	public GameBoard() {
		super();
		// Initalizing pGameArray
		int _gameHeight = -1;
		char[][] _pGameArray = {
				{'#','#','#','#','#'},
				{'#',' ',' ',' ','#'},
				{'#','&',' ',' ','#'},
				{'#',' ',' ',' ','#'},
				{'#',' ',' ',' ','#'},
				{'#',' ',' ',' ','#'},
				{'#',' ',' ',' ','#'},
				{'#','#','#','#','#'},
		};
		_gameHeight = _pGameArray.length;
		
		for(int i = 0; i < _gameHeight; i++)  {
			this.pGame.add(new ArrayList<StdTile>());
		}
		
		for (int i = 0; i < pGame.size(); i++) {
			for (int k=0; k<_pGameArray[i].length; k++){
				// ~ ~ ~ Static Tile Initalization ~ ~ ~ //
				if(_pGameArray[i][k]== '#') {
					this.pGame.get(i).add(new Wall(i,k));
				}
				else if(_pGameArray[i][k]== ' ') {
					this.pGame.get(i).add(new Air(i,k));
				}
				else if(_pGameArray[i][k]== '*') {
					this.pGame.get(i).add(new PressurePlate(i,k));
				}
				else if(_pGameArray[i][k]== '°') {
					this.pGame.get(i).add(new Token(i,k));
				}
				else if(_pGameArray[i][k]== 's') {
					this.pGame.get(i).add(new Start(i,k));
				}	
				else if(_pGameArray[i][k]== 'e') {
					this.pGame.get(i).add(new End(i,k));
				}
				
				
				// ~ ~ ~ Entity Tile Initalization ~ ~ ~ //
				else if(_pGameArray[i][k]== '&'){
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else if(_pGameArray[i][k]== '■'){
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else if(_pGameArray[i][k]== 'Ø') {
					this.pGame.get(i).add(new Wall(i,k,'Ø'));
				}
				else if(_pGameArray[i][k]== '?') {
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else {
					
				}
			}
		}
		//End Outer For
	}
	
	
		
	
	public ArrayList<ArrayList<StdTile>> getpGame() {
		return pGame;
	}
	/**
	 * will update gameboard object's state internally.
	 * <br> <br> 
	 * This <i>MIGHT</i> cause memory problems. <br>
	 * Such as linking main's gameboard to internal <br>
	 * gameboard.
	 * 
	 * <br> ~ ~ <br>TODO Fix Memory Issues
	 * 
	 * @param paramBoard Current/Updated Gameboard.
	 */
	public void updateGameBoard(ArrayList<ArrayList<StdTile>> paramBoard) {
		// We WANT pass by Value to discard this.pGame's data // 
		
		
		this.pGame = paramBoard;
	}
	
	
	public void updateGameBoard(char[][] InStuf) {
		// We WANT pass by Value to discard this.pGame's data // 
		int _gameHeight = -1;
		char[][] _pGameArray = InStuf;
		_gameHeight = _pGameArray.length;
		
		for(int i = 0; i < _gameHeight; i++)  {
			this.pGame.add(new ArrayList<StdTile>());
		}
		
		for (int i = 0; i < pGame.size(); i++) {
			for (int k=0; k<_pGameArray[i].length; k++){
				// ~ ~ ~ Static Tile Initalization ~ ~ ~ //
				if(_pGameArray[i][k]== '#') {
					this.pGame.get(i).add(new Wall(i,k));
				}
				else if(_pGameArray[i][k]== ' ') {
					this.pGame.get(i).add(new Air(i,k));
				}
				else if(_pGameArray[i][k]== '*') {
					this.pGame.get(i).add(new PressurePlate(i,k));
				}
				else if(_pGameArray[i][k]== '°') {
					this.pGame.get(i).add(new Token(i,k));
				}
				else if(_pGameArray[i][k]== 's') {
					this.pGame.get(i).add(new Start(i,k));
				}	
				else if(_pGameArray[i][k]== 'e') {
					this.pGame.get(i).add(new End(i,k));
				}
				
				
				// ~ ~ ~ Entity Tile Initalization ~ ~ ~ //
				else if(_pGameArray[i][k]== '&'){
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else if(_pGameArray[i][k]== '■'){
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else if(_pGameArray[i][k]== 'Ø') {
					this.pGame.get(i).add(new Wall(i,k,'Ø'));
				}
				else if(_pGameArray[i][k]== '?') {
					this.pGame.get(i).add(new Air(i,k,'?'));
				}
				else {
					
				}
			}
		}
		//End Outer For
		
		
	}
	
	
	public void terminalRender(){
		System.out.println(' ');
		for(int i = 0; i < pGame.size(); i++) {
			System.out.println(' ');
			for (int k = 0; k < pGame.get(i).size(); k++) {
				this.pGame.get(i).get(k).draw();
			}
		}
	}
	
	
	// ~ ~ ~ ~ ~ UnImplemented Functions ~ ~ ~ ~ ~ //
	/**
	 * grabs your current level from a hardcoded bank of levels in array from Files
	 * <br><br><i>UNIMPLEMENTED</i><br>
	 * @return a raw array of characters from ColdStorage
	 */
	public static char[][] setGameArrayBoardFromSrc(int paramNumLevel) {
		// Grabs from File 
		/*
		 * TO be implemented soon. Will take lots of time...
		 */
		
		return _loadArraySTATIC(paramNumLevel);
	}
	
	// ~ ~ ~ Private Helper Functions ~ ~ ~ //
	private static char[][] _loadArraySTATIC(int numLevel) {
		// Grab From File 
		char[][] po = {
				{' ',' ',' ','#','#','#','#','#'},
				{'#','S','#','#',' ',' ','#','#'},
				{'#',' ',' ',' ','#',' ','#','#'},
				{'#',' ',' ',' ','#','#','#','#'},
				{'#',' ',' ',' ',' ','#','#','#'},
				{'#','B',' ','#',' ','E','#','#'},
				{'#',' ',' ','#',' ','#','#','#'},
				{'#','#','#','#','#','#','#','#'}		
		};
		return po;
	}
	
	
	
	private static char[][] _loadArrayFile(int numLevel){
		// TODO Implement File Loading
		
		
		return _loadArraySTATIC(numLevel);
	}
	
}
