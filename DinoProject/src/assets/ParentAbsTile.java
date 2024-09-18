/**
 * 
 */
package assets;

import java.util.*;
import dinoMainPKG.InteractionResult;

/**
 * 
 */
public abstract class ParentAbsTile {
	// TODO move render stack managment into its own class
	
	private int[] location = new int[2];
	private ArrayList<StdTile> renderStack;
	protected char symbol;
	
	/**
	 * 
	 * @param pFrom The Interactor
	 * @param pOnto The Interactee
	 * @return
	 */
	public abstract InteractionResult interact(StdTile pFrom, StdTile pOnto);
	
	
	
	// ~ ~ ~ Render Stack Stuff ~ ~ ~ //
	
	// Push a StdTile object onto the stack
    public void push(StdTile _tile) {
        this.getRenderStack().add(_tile);
    }

    // Pop a StdTile object from the top of the stack
    public StdTile pop() {
        if (!getRenderStack().isEmpty()) {
            return getRenderStack().remove(getRenderStack().size() - 1);
        }
        // Return null or throw an exception if the stack is empty
        return null; 
    }
    
	public ArrayList<StdTile> getRenderStack() {
		return renderStack;
	}

	public void setRenderStack(ArrayList<StdTile> renderStack) {
		this.renderStack = renderStack;
	}
}
