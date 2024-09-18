package assets;
import java.util.ArrayList;

import dinoMainPKG.InteractionResult;

@SuppressWarnings("unused")
public interface Immovable {
	/**
	 * this interact onto that (ponto)
	 * @param pOnto The Interactee
	 * @return
	 */
	public InteractionResult interact(StdTile pOnto);
}
