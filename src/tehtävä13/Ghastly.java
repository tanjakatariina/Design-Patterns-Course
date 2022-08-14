package tehtävä13;

// ConcreteState
public class Ghastly extends PokemonState {

	private static Ghastly instance = null;

	private Ghastly() {
	}

	public static Ghastly getInstance() {
		if (instance == null) {
			instance = new Ghastly();
		}
		return instance;
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("\nGhastly used Lick attack!\n");
		pokemon.setEXP(pokemon.getEXP() + 20);
	}
	
	@Override
	public void dodge(Pokemon pokemon) {
		System.out.println("\nGreat moves! Ghastly dodged the attack by hiding behind a rock.\n");
		pokemon.setEXP(pokemon.getEXP() + 10);
	}
	
	@Override
	public void move(Pokemon pokemon) {
		System.out.println("\nGhastly is flying around...\n");
		pokemon.setEXP(pokemon.getEXP() + 5);
	}
	
    @Override
    public void accept(Visitor visitor, Pokemon pokemon) {
        visitor.visit(this, pokemon);
    }
}