package tehtävä18.deepClone;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Syväkopio testi\n");
		
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
		
		// Tarkistetaan alkuperäisen kellon aika, pitäisi olla muuttumaton, eli 10:14
		System.out.println("Alkuperäisen kellon aika kloonin muutoksen jälkeen: " + clockOrg);
		
		// Muutetaan alkuperäisen kellon aikaa
		clockOrg.getHourHand().setTime(23);
		clockOrg.getMinHand().setTime(20);
		System.out.println("Alkuperäistä kellon aikaa muutettu aikaan: " + clockOrg); // Aika 23:20
		
		// Tarkistetaan klooni kellon aika, pitäisi olla muuttumaton, eli 21:19
		System.out.println("Klooni kellon aika alkuperäisen muutoksen jälkeen: " + clockClone); // Aika 21:19
	}

}
