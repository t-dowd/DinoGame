package concreteTiles;

import java.util.Arrays;

import assets.Immovable;
import assets.ParentAbsTile;
import assets.StdTile;
import dinoMainPKG.InteractionResult;

public class PressurePlate extends ParentAbsTile implements StdTile, Immovable {
	
	
	public PressurePlate() {
		super();
		this.setLocation(-1, -1);
		this.setSymbol(' ');
	}
	public PressurePlate(int i, int k, Character pChar) {
		super();
		this.setLocation(i, k);
		this.setSymbol(pChar);
	}
	public PressurePlate(int i, int k) {
		super();
		this.setLocation(i, k);
		this.setSymbol(' ');
	}
	
	
	@Override
	public InteractionResult interact(StdTile pOnto) {
		// TODO interaction for PressurePlate
		return InteractionResult.CollisionDisAllowed;
	}

	
	/*
	 * ~ ~ ~ To String ~ ~ ~ 
	 */
	@Override
	public String toString() {
		return "("+ Arrays.toString(location) + ", s=" + symbol + ")";
	}
	@Override
	public void draw() {
		System.out.print(this.getSymbol());
	}

	@Override
	public StdTile peek() {
		return this;
	}
	
	@Override
	public void setLocation(int[] pLocation) {
		this.location = pLocation;
	}
	public void setLocation(int x, int y) {
		int [] tQ = {x,y};
		setLocation(tQ);
	}
	@Override
	public char getSymbol() {
		return this.symbol;
	}

	@Override
	public void setSymbol(char pSymbol) {
		this.symbol = pSymbol;
		
	}
	@Override
	public int[] getLocation() {
		return this.location;
	}
	
	
	
	

}
