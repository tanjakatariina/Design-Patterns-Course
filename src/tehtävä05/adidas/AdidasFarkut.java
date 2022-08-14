package tehtävä05.adidas;

import tehtävä05.IFarkut;

// Product
public class AdidasFarkut implements IFarkut {
	@Override
	public void pueFarkut() {
		System.out.println("Adidas farkut puettu päälle.");
	}
	
	@Override
	public String toString() {
		return "Adidas farkut";
	}
}
