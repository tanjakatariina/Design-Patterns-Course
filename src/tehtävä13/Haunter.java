package tehtävä13;

//ConcreteState
public class Haunter extends PokemonState {

	private static Haunter instance = null;

	private Haunter() {
	}

	public static Haunter getInstance() {
		if (instance == null) {
			instance = new Haunter();
		}
		return instance;
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("\nHaunter used Mean Look attack!\n");
		pokemon.setEXP(pokemon.getEXP() + 30);
	}
	
	@Override
	public void dodge(Pokemon pokemon) {
		System.out.println("\nGreat moves! Haunter dodged the attack by vanishing into thin air.\n");
		pokemon.setEXP(pokemon.getEXP() + 15);
	}
	
	@Override
	public void move(Pokemon pokemon) {
		System.out.println("\nHaunter is levitating around...\n");
		pokemon.setEXP(pokemon.getEXP() + 10);
	}
	
    @Override
    public void accept(Visitor visitor, Pokemon pokemon) {
        visitor.visit(this, pokemon);
    }
}