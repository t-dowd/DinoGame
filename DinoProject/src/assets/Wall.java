package assets;



import java.util.Arrays;

import dinoMainPKG.InteractionResult;

public class Wall extends ParentAbsTile implements StdTile {

	
	
	public Wall() {
		super();
		this.setLocation(-1, -1);
		this.setSymbol('#');
	}
	
	public Wall(int i, int k, Character pChar) {
		super();
		this.setLocation(i, k);
		this.setSymbol(pChar);
	}
	
	public Wall(int i, int k) {
		super();
		this.setLocation(i, k);
		this.setSymbol('#');
	}
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
	public InteractionResult interact(StdTile pOnto) {
		return InteractionResult.CollisionDisAllowed;
	}

	@Override
	public int[] getLocation() {
		return null;
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
	
	
	
}
