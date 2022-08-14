package tehtävä13;

// Context
public class Pokemon {
	
	private PokemonState state;
	private Visitor visitor;
	private int exp; // Experience points
	
	public Pokemon() {
		state = Ghastly.getInstance(); // First evolution
		visitor = new EvolveVisitor();
		exp = 0;
	}
	
	public void attack() {
		state.attack(this);
		state.accept(visitor, this);
	}
	
	public void dodge() {
		state.dodge(this);
		state.accept(visitor, this);
	}
	
	public void move() {
		state.move(this);
		state.accept(visitor, this);
	}
	
	public void skip() {
		state.skip(this);
	}
	
	protected void evolve(PokemonState pokemonState) {
		state = pokemonState;
	}
	
	public int getEXP() {
		return exp;
	}
	
	public void setEXP(int exp) {
		this.exp = exp;
	}
}