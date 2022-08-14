package tehtävä20;

import java.util.Iterator;

public class BMain {

	public static void main(String[] args) {
		List list = new List(20);

		/*
		 * B: Iteroidaan kokoelma kahdella säikeellä käyttäen samaa iteraattoria.
		 * 
		 * Tulos: Kaikki listan arvot tulostetaan. Säikeet tulostelevat listan samoja
		 * arvoja melkein järjestyksessä. Arvot eivät tulleet ihan järjestykessä vaan
		 * hyppivät välillä. Alhaalla yksi testiajo.
		 * 
		 * Thread 1: 1 
		 * Thread 1: 2 
		 * Thread 1: 3 
		 * Thread 1: 4 
		 * Thread 1: 5 
		 * Thread 1: 6
		 * Thread 1: 7 
		 * Thread 1: 8 
		 * Thread 1: 9 
		 * Thread 1: 10 
		 * Thread 1: 11 
		 * Thread 1: 12
		 * Thread 1: 13 
		 * Thread 1: 14 
		 * Thread 2: 15 
		 * Thread 2: 17 
		 * Thread 1: 16 
		 * Thread 1: 19
		 * Thread 2: 18 
		 * Thread 1: 20
		 */
		
		System.out.println("B: 2 säiettä, sama iteraattori.\n");

		// Yhteinen iteraattori
		Iterator<Integer> iterator = list.getList().iterator();

		// EKa säie
		new Thread(() -> {
			while (iterator.hasNext()) {
				System.out.println("Thread 1: " + iterator.next());
			}
		}).start();

		// Toka säie
		new Thread(() -> {
			while (iterator.hasNext()) {
				System.out.println("Thread 2: " + iterator.next());
			}
		}).start();
	}

}
