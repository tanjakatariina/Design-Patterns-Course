package tehtävä02.adidas;

import tehtävä02.IFarkut;

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
