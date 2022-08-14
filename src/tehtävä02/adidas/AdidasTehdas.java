package tehtävä02.adidas;

import tehtävä02.IFarkut;
import tehtävä02.IKengät;
import tehtävä02.ILippis;
import tehtävä02.IPaita;
import tehtävä02.ITuoteTehdas;

// Concrete Factory
public class AdidasTehdas implements ITuoteTehdas {

	@Override
	public ILippis createLippis() {
		return new AdidasLippis();
	}

	@Override
	public IPaita createPaita() {
		return new AdidasPaita();
	}

	@Override
	public IFarkut createFarkut() {
		return new AdidasFarkut();
	}

	@Override
	public IKengät createKengät() {
		return new AdidasKengät();
	}
}