package tehtävä05.boss;

import tehtävä05.IKengät;

//Product
public class BossKengät implements IKengät{

	@Override
	public void pueKengät() {
		System.out.println("Boss kengät puettu päälle.");
	}
	
	@Override
	public String toString() {
		return "Boss kengät";
	}
}
