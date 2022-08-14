package tehtävä06;

//ConcreteDecorator
public class Kinkku extends Tayte {

	private String nimi = "Kinkku";
	private double hinta = 2.0;
	
	public Kinkku(Pizza pizza) {
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