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
	
	protected int[] location = new int[2];
	private ArrayList<StdTile> renderStack;
	protected char symbol;
	
	/**
	 * this interact onto that (ponto)
	 * @param pOnto The Interactee
	 * @return
	 */
	public abstract InteractionResult interact(StdTile pOnto);
	// Getters and Setters
	public abstract int[] getLocation();
	public abstract void setLocation(int[] location);
	public abstract char getSymbol();
	public abstract void setSymbol(char symbol);
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
