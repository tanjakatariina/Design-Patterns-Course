package tehtävä02.boss;

import tehtävä02.IPaita;

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