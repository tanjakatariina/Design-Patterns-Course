package tehtävä02.boss;

import tehtävä02.IKengät;

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
