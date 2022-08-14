package tehtävä03;

// Leaf
public class Muistipiiri implements ILaiteosa{

	private double hinta = 350.40;

	@Override
	public double tulostaHinta() {
		return hinta;
	}
}