package tehtävä03;

// Leaf
public class Prosessori implements ILaiteosa{

	private double hinta = 700.50;
	
	@Override
	public double tulostaHinta() {
		return hinta;
	}
}