/**
 * 
 */
package dinoMainPKG;

import java.util.*;

import assets.StdTile;
/**
 * 
 */

public class GameBoard {
	
	private ArrayList<ArrayList<StdTile>> pGame= new ArrayList<ArrayList<StdTile>>();
	
	
	
	public static char[][] setGameBoardFromArray() {
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
	
	public ArrayList<ArrayList<StdTile>> getpGame() {
		return pGame;
	}
	
	
	public void terminalRender(){
		System.out.println(' ');
		for(int i = 0; i < pGame.size(); i++) {
			System.out.println(' ');
			for (int k = 0; k < pGame.get(i).size(); k++) {
				if (pGame.get(i).get(k) == null) {
					System.out.print('?');
				}
				else {
					pGame.get(i).get(k).draw();
				}
			}
		}
	}

	public GameBoard(ArrayList<ArrayList<StdTile>> pGame) {
		super();
		// Initalizing pGameArray
		int _gameHeight = -1;
		char[][] _pGameArray = setGameBoardFromArray();
		_gameHeight = _pGameArray.length;
		for(int i = 0; i < _gameHeight; i++)  {
			this.pGame.add(new ArrayList<StdTile>());
		}
		
		
		StdTile _tObjIter = new StdTile();
		for (int i = 0; i < pGame.size(); i++) {
			for (int k=0; k<_pGameArray[i].length; k++){
				if(_pGameArray[i][k]== '#') {
					_tObjIter = new StdTile('#',k,i);
					
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
					pGame.get(i).add(null);
				}
				else if(_pGameArray[i][k]== '?') {
					pGame.get(i).add(null);
				}
				else {
					pGame.get(i).add(null);
				}
			}
		}	
	}	
}
