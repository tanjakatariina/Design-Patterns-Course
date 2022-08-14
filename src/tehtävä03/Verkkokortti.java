package tehtävä03;

// Leaf
public class Verkkokortti implements ILaiteosa {

	private double hinta = 220.00;
	
	@Override
	public double tulostaHinta() {
		return hinta;
	}
}