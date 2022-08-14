package tehtävä05.boss;

import tehtävä05.IPaita;

//Product
public class BossPaita implements IPaita{

	@Override
	public void puePaita() {
		System.out.println("Boss paita puettu päälle.");
	}
	
	@Override
	public String toString() {
		return "Boss paita";
	}
}