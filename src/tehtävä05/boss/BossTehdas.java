package tehtävä05.boss;

import tehtävä05.IFarkut;
import tehtävä05.IKengät;
import tehtävä05.ILippis;
import tehtävä05.IPaita;
import tehtävä05.TuoteTehdas;

// Concrete Factory
public class BossTehdas extends TuoteTehdas {

	@Override
	public ILippis createLippis() {
		return new BossLippis();
	}

	@Override
	public IPaita createPaita() {
		return new BossPaita();
	}

	@Override
	public IFarkut createFarkut() {
		return new BossFarkut();
	}

	@Override
	public IKengät createKengät() {
		return new BossKengät();
	}

	@Override
	public String toString() {
		return "boss";
	}
	
}