package dinoMainPKG;

import assets.Mobile;
import assets.StdTile;

public class Player implements Mobile, StdTile {
	
	/*
	 * 
	 */
	
	@Override
	public InteractionResult interact(StdTile pOnto) {
		
		
		return InteractionResult.None;
	}
	
	
	@Override
	public InteractionResult Collision(StdTile pOnto) {
		
		
		
		return InteractionResult.None;
	}
	
	
	// ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ //
	
	
	@Override
	public int[] getLocation() {
		return null;
	}
	
	
	
}
