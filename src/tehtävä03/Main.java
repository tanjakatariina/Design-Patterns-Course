package tehtävä03;

// Client
public class Main {

	public static void main(String[] args) {
		ILaiteosa kotelo = new Kotelo();
		
		ILaiteosa emolevy = new Emolevy();
		
		ILaiteosa muistipiiri = new Muistipiiri();
		ILaiteosa muistiipiiri2 = new Muistipiiri();
		
		ILaiteosa näytönohjain = new Näytönohjain();
		
		ILaiteosa prosessori = new Prosessori();
		
		ILaiteosa verkkokortti = new Verkkokortti();
		
		((Emolevy) emolevy).lisaaOsa(muistipiiri);
		((Emolevy) emolevy).lisaaOsa(muistiipiiri2);
		((Emolevy) emolevy).lisaaOsa(näytönohjain);
		((Emolevy) emolevy).lisaaOsa(prosessori);
		((Emolevy) emolevy).lisaaOsa(verkkokortti);
		
		((Kotelo) kotelo).lisaaOsa(emolevy);
		
		System.out.println("Tietokoneen kokoonpanon kokonaishinta: " + kotelo.tulostaHinta() + "€");
	}
}