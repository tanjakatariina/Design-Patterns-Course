package tehtävä05.adidas;

import tehtävä05.IFarkut;
import tehtävä05.IKengät;
import tehtävä05.ILippis;
import tehtävä05.IPaita;
import tehtävä05.TuoteTehdas;

// Concrete Factory
public class AdidasTehdas extends TuoteTehdas {

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
	
	@Override
	public String toString() {
		return "adidas";
	}
}