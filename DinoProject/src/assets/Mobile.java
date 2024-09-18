/**
 * 
 */
package assets;

import java.util.ArrayList;

import dinoMainPKG.*;
/**
 * 
 */
@SuppressWarnings("unused")
public interface Mobile {
	/**
	 * For Validating potential locations.
	 * this interact onto that (ponto)
	 * @param pOnto The Interactee
	 * @return
	 */
	public InteractionResult interact(StdTile pOnto);
	
	/**
	 * For Validating potential locations.
	 */
	public InteractionResult Collision(StdTile pOnto);
	
}
