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
	 * this interact onto that (ponto)
	 * @param pOnto The Interactee
	 * @return
	 */
	public InteractionResult interact(StdTile pOnto);
}
