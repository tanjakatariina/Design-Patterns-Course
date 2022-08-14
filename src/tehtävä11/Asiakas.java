package tehtävä11;

import java.util.Random;

// Caretaker
public class Asiakas extends Thread {

	private Arvuuttaja arvuuttaja;
	private Object object;
	private int arvauksia, luku;
	private String pelaajanNimi;
	private Random rand;

	public Asiakas(String pelaajanNimi, Arvuuttaja arvuuttaja) {
		this.rand = new Random();
		this.pelaajanNimi = pelaajanNimi;
		this.arvuuttaja = arvuuttaja;
		this.arvauksia = 0;
	}

	public void liityPeliin() {
		object = arvuuttaja.liityPeliin();
	}

	public synchronized boolean arvaa() {
		luku = rand.nextInt(10 - 1) + 1;
		arvauksia++;
		return arvuuttaja.vertaa(object, luku);
	}

	@Override
	public void run() {
		liityPeliin();
		boolean oikeaVastaus = false;

		while (!oikeaVastaus) {
			boolean arvaus = arvaa();
			if (arvaus) {
				System.err.println(pelaajanNimi + " arvasi oikein luvulla " + luku + "! Arvauksien määrä: " + arvauksia);
				oikeaVastaus = true;
			} else {
				System.out.println(pelaajanNimi + " arvasi väärin luvulla " + luku);
			}
		}
	}
}