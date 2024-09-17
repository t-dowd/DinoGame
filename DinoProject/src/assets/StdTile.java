/**
 * 
 */
package assets;

import java.util.Arrays;

/**
 * 
 */
public class StdTile {
	protected char symbol; 
	protected final int[] coord = new int[2];
	
	
	public StdTile(char symbol, int xcoord, int ycoord) {
		super();
		this.symbol = symbol;
		this.coord[0] = xcoord;
		this.coord[1] = ycoord;
	}
	
	public StdTile(char symbol, int[] coord) {
		super();
		this.symbol = symbol;
		this.coord[0] = coord[0];
		this.coord[1] = coord[1];
	}
	
	public StdTile(int xcoord, int ycoord) {
		super();
		this.symbol = ' ';
		this.coord[0] = xcoord;
		this.coord[1] = ycoord;
	}
	public StdTile() {
		super();
		this.symbol = ' ';
		this.coord[0] = -1;
		this.coord[1] = -1;
	}
	
	
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	public int x(){
		return this.coord[0];
	}
	public int y(){
		return this.coord[1];
	}
	// TODO Draw()
	public final void draw() {
		System.out.print(this.symbol);
	}

	@Override
	public String toString() {
		return "StdTile [symbol=" + symbol + ", coord=(" + Arrays.toString(coord) + ")]";
	}
	
	
}
