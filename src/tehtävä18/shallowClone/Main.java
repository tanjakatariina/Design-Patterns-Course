package tehtävä18.shallowClone;

public class Main {

	public static void main(String[] args) {

		System.out.println("Matalakopio testi\n");

		// Alkuperäinen
		Clock clockOrg = new Clock(14, 10);
		System.out.println("Orginaalin kello luotu ja aika asetettu ajaksi: " + clockOrg); // Aika on 10:14

		// Klooni
		Clock clockClone = clockOrg.clone();
		System.out.println("Klooni kello kopioitu alkuperäisestä ja kloonin aika on: " + clockClone); // Aika on 10:14

		// Muutetaan kloonin aikaa
		clockClone.getHourHand().setTime(21);
		clockClone.getMinHand().setTime(19);
		System.out.println("Klooni kellon aika muutettu aikaan: " + clockClone); // Aika on 21:19

		/*
		 * Tarkistetaan alkuperäisen kellon aika, alkuperäisen ClockHand olioiden aika
		 * on myös muuttunut.
		 */
		System.out.println("Alkuperäisen kellon aika kloonin muutoksen jälkeen: " + clockOrg); // Aika on 21:19

		// Muutetaan alkuperäisen kellon aikaa
		clockOrg.getHourHand().setTime(23);
		clockOrg.getMinHand().setTime(20);
		System.out.println("Alkuperäistä kellon aikaa muutettu aikaan: " + clockOrg); // Aika 23:20

		/*
		 * Tarkistetaan klooni kellon aika, kloonin ClockHand olioiden aika on myös
		 * muuttunut.
		 */
		System.out.println("Klooni kellon aika alkuperäisen muutoksen jälkeen: " + clockClone); // Aika on 23:20
	}

}
