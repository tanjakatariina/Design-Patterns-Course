package tehtävä02.adidas;

import tehtävä02.ILippis;

//Product
public class AdidasLippis implements ILippis {

	@Override
	public void pueLippis() {
		System.out.println("Adidas lippis puettu päälle.");
	}
	
	@Override
	public String toString() {
		return "Adidas lippis";
	}
}