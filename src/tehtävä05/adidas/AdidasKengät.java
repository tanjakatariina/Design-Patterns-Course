package tehtävä05.adidas;

import tehtävä05.IKengät;

//Product
public class AdidasKengät implements IKengät {
	@Override
	public void pueKengät() {
		System.out.println("Adidas kengät puettu päälle.");
	}
	
	@Override
	public String toString() {
		return "Adidas kengät";
	}
}
