package tehtävä01;

public class Koodari extends AterioivaOtus {
	
	@Override
	public Juoma createJuoma() {
		return new Kalja();
	}

	@Override
	public Ruoka createRuoka() {
		return new Makkara();
	}
}