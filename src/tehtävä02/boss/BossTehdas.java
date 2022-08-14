package tehtävä02.boss;

import tehtävä02.IFarkut;
import tehtävä02.IKengät;
import tehtävä02.ILippis;
import tehtävä02.IPaita;
import tehtävä02.ITuoteTehdas;

// Concrete Factory
public class BossTehdas implements ITuoteTehdas {

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

}