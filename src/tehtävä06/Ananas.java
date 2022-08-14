package tehtävä06;

// ConcreteDecorator
public class Ananas extends Tayte {

	private String nimi = "Ananas";
	private double hinta = 3.0;
	
	public Ananas(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String tayta() {
		String taytteet = super.tayta(); // Delegointimetodin kutsu
		taytteet += ", " + getNimi(); // Lisätty toiminnallisuus (Lisätään täytteisiin uusi täyte)
		return taytteet;
	}
		
	@Override
	public double hinta() {
		return super.hinta() + hinta;
	}
	
	private String getNimi() {
		return nimi;
	}
}