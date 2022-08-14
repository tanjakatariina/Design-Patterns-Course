package tehtävä20;

import java.util.Iterator;

public class CMain {

	public static void main(String[] args) {
		List list = new List(20);

		/*
		 * C: Toinen säie iteroi kokoelmaa ja toinen tekee muokkauksia kokoelmaan.
		 * Säikeillä on omat iteraattorit. Ekassa säikeessä jokaisen tulostuksen jälkeen
		 * lisätään listaan nolla.
		 * 
		 * Tulos: Koodi heittää Exception in thread "Thread-0"
		 * java.util.ConcurrentModificationException ja Exception in thread "Thread-1"
		 * java.util.ConcurrentModificationException poikkeukset.
		 * 
		 * Pokkeukset aiheutuvat kun yksi säie yrittää muokata kokoelmaa toisen
		 * iteroidessa sitä. Jotkut Iterator-toteutukset (mukaan lukien kaikki JRE:n
		 * tarjoamat yleiskäyttöiset kokoelma toteutukset) voivat heittää tämän
		 * poikkeuksen, jos tälläinen käyttäytyminen havaitaan. Tälläiset iteraattorit
		 * tunnetaan 'fail-fast' iteraattoreina.
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/
		 * ConcurrentModificationException.html
		 */

		System.out.println("C: 2 säiettä (omat iteraattori). Toinen iteroi ja toinen muokkaa kokoelmaa.\n");

		// Ekan iteraattori ja säie.
		Iterator<Integer> iterator1 = list.getList().iterator();
		new Thread(() -> {
			while (iterator1.hasNext()) {
				System.out.println("Thread 1: " + iterator1.next());
				list.getList().add(0);
			}
		}).start();

		// Tokan iteraattori ja säie.
		Iterator<Integer> iterator2 = list.getList().iterator();
		new Thread(() -> {
			while (iterator2.hasNext()) {
				System.out.println("Thread 2: " + iterator2.next());
			}
		}).start();

	}

}
