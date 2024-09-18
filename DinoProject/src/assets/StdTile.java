package assets;
/*
 *  This may or may not represnt the null status for the 
 *  boardgame. At user level this represents the air and
 *  or blank tiles.
 */

import java.util.ArrayList;


/*

~ ~ ~ ~ Static Tiles ~ ~ ~ ~
	# = Wall
	  = Air (or StdTile?)
	* = PressurePlate
	° = Token/Coin
	s = Start
	e = End 
	
~ ~ ~ ~ Entity Tiles ~ ~ ~ ~
	■ = Block
	& = Player
	
~ ~ ~ ~ Basic Tiles ~ ~ ~ ~ 
	Ø = Static Tile (Ukn/Base)
	? = Entity Tile (Ukn/Base)

*/

// private ArrayList<StdTile> renderStack = new ArrayList<StdTile>();
/**
 * The basis interface for the terminal boardgame.
 */
public interface StdTile {
	
	public int[] getLocation();
	/**
	 * in StdTile form it will simply draw a space.
	 */
	public default void draw() {
		// Hopefully this happens when we do the whole .Draw Stuff.
		System.out.print(' ');
	}
	/**
	 * This should <i>HOPEFULLY</i> return a null spot if it is simply a StdTile.
	 * @return
	 */
	public default StdTile tileCopy() {
		return null;
	}
	/**
	 * <i>have ParentAbsTile open to understand this Function </i> <br>
	 * This function is for rendering each tile. 
	 * @return
	 */
	public default StdTile peek() {
        return null;
    }
	
}
