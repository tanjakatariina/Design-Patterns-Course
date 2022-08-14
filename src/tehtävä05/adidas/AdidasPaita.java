package tehtävä05.adidas;

import tehtävä05.IPaita;

//Product
public class AdidasPaita implements IPaita {

	@Override
	public void puePaita() {
		System.out.println("Adidas paita puettu päälle.");
	}
	
	@Override
	public String toString() {
		return "Adidas paita";
	}

}
