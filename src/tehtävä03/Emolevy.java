package tehtävä03;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Emolevy implements ILaiteosa{

	private double hinta = 999.00;
	private List<ILaiteosa> osat = new ArrayList<ILaiteosa>();
	
	@Override
	public double tulostaHinta() {
		double kokoHinta = 0;
		
		for (ILaiteosa osa : osat) {
			kokoHinta += osa.tulostaHinta();
		}
		
		return kokoHinta + hinta;
	}
	
	public void lisaaOsa(ILaiteosa osa) {
		osat.add(osa);
	}
}