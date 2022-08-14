package tehtävä02.boss;

import tehtävä02.ILippis;

//Product
public class BossLippis implements ILippis {

	@Override
	public void pueLippis() {
		System.out.println("Boss lippis puettu päälle.");
	}
	
	@Override
	public String toString() {
		return "Boss lippis";
	}
}