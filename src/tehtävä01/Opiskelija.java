package tehtävä01;

public class Opiskelija extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		return new Mehu();
	}

	@Override
	public Ruoka createRuoka() {
		return new Nuudeli();
	}
}