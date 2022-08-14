package tehtävä03;

// Leaf
public class Näytönohjain implements ILaiteosa {

	private double hinta = 1599.99;
	
	@Override
	public double tulostaHinta() {
		return hinta;
	}
}