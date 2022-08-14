package tehtävä02.boss;

import tehtävä02.IFarkut;

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