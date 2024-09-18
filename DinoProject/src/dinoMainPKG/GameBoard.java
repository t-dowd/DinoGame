package dinoMainPKG;

import java.util.ArrayList;

import assets.StdTile;
import concreteTiles.*;

/*
 * ALL THIS DOES IS INITALIE THE BOARD
 * 
 */
public class GameBoard {
	private static boolean pullArray= true;
	private char[][] level;

	/*
	 * Param Const
	 */
	public GameBoard(char[][] level) {
		super();
		this.level = level;
	}
	
	/*
	 * Default Const
	 */
	public GameBoard() {
		super();
		this.level = _loadArray();
	}
	
	private static char[][] _loadArray(){
		if(pullArray) {
			char[][] po = {
					{' ',' ',' ','#','#','#','#'},
					{'#','s','#','#','&','■','#'},
					{'#',' ',' ',' ','#','Ø','#'},
					{'#',' ',' ',' ','#','#','#'},
					{'#','°',' ',' ',' ','#','#'},
					{'#',' ',' ','#',' ','e','#'},
					{'#',' ',' ','#',' ','#','#'},
					{'#','#','#','#','#','#','#'}		
			};
			return po;
		}
		// Pull from File
		else {  
			char[][] po = {
					{'#','#','#','?','#'},
					{'#','Ø','#','#','#'},
					{'#','■','*','#','#'},
					{'#',' ','#','e','#'},
					{'#','*',' ',' ','#'},
					{'#','°',' ',' ','#'},
					{'#','#','#','#','#'}		
					};
			return po;	
		}
		
		
	}
	
	public ArrayList<ArrayList<StdTile>> converter(){
		int _gameHeight = -1;
		char[][] _pGameArray = this.level;
		ArrayList<ArrayList<StdTile>> pGame= new ArrayList<ArrayList<StdTile>>();
		_gameHeight = _pGameArray.length;
		
		for(int i = 0; i < _gameHeight; i++)  {
			pGame.add(new ArrayList<StdTile>());
		}
		
		for (int i = 0; i < pGame.size(); i++) {
			for (int k=0; k<_pGameArray[i].length; k++){
				// ~ ~ ~ Static Tile Initalization ~ ~ ~ //
				if(_pGameArray[i][k]== '#') {
					pGame.get(i).add(new Wall(i,k));
				}
				else if(_pGameArray[i][k]== ' ') {
					pGame.get(i).add(new Air(i,k));
				}
				else if(_pGameArray[i][k]== '*') {
					pGame.get(i).add(new PressurePlate(i,k));
				}
				else if(_pGameArray[i][k]== '°') {
					pGame.get(i).add(new Token(i,k));
				}
				else if(_pGameArray[i][k]== 's') {
					pGame.get(i).add(new Start(i,k));
				}	
				else if(_pGameArray[i][k]== 'e') {
					pGame.get(i).add(new End(i,k));
				}
				
				
				// ~ ~ ~ Entity Tile Initalization ~ ~ ~ //
				else if(_pGameArray[i][k]== '&'){
					pGame.get(i).add(new Air(i,k,'?'));
				}
				else if(_pGameArray[i][k]== '■'){
					pGame.get(i).add(new Air(i,k,'?'));
				}
				else if(_pGameArray[i][k]== 'Ø') {
					pGame.get(i).add(new Wall(i,k,'Ø'));
				}
				else if(_pGameArray[i][k]== '?') {
					pGame.get(i).add(new Air(i,k,'?'));
				}
				else {
					
				}
			}
		}
		//End Outer Fo
		return pGame;
	}
	
	public final void terminalRender(ArrayList<ArrayList<StdTile>> pGame) {
		System.out.println(' ');
		for(int i = 0; i < pGame.size(); i++) {
			System.out.println(' ');
			for (int k = 0; k < pGame.get(i).size(); k++) {
				pGame.get(i).get(k).draw();
			}
		}
	}
	
}
