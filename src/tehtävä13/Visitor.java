package tehtävä13;

// Visitor
public interface Visitor {
	public void visit(Ghastly ghastly, Pokemon pokemon);
	public void visit(Haunter haunter, Pokemon pokemon);
	public void visit(Gengar gengar, Pokemon pokemon);
}