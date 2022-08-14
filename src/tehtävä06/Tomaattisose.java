package tehtävä06;

//ConcreteDecorator
public class Tomaattisose extends Tayte {

	private String nimi = "Tomaattisose";
	private double hinta = 0.5;
	
	public Tomaattisose(Pizza pizza) {
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