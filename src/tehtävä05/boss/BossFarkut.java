package tehtävä05.boss;

import tehtävä05.IFarkut;

//Product
public class BossFarkut implements IFarkut {

	@Override
	public void pueFarkut() {
		System.out.println("Boss farkut puettu päälle.");
	}
	
	@Override
	public String toString() {
		return "Boss farkut";
	}
}