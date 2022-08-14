package tehtävä11;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		int pelaajia = 5; // kuinka monta pelaajaa halutaan
		
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Asiakas[] pelaajat = new Asiakas[pelaajia];
		
		// Luo pelaajat
		for (int i = 0; i < pelaajat.length; i++) {
			String pelaaja = "pelaaja " + (i+1);
			pelaajat[i] = new Asiakas(pelaaja, arvuuttaja);
		}
		
		// Käynnistä säikeet
		for (Asiakas p : pelaajat) {
			p.start();
		}
	}
}