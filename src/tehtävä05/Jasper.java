package tehtävä05;

// Client
public class Jasper {
	private TuoteTehdas tehdas = null;
	private ILippis lippis = null;
	private IPaita paita = null;
	private IFarkut farkut = null;
	private IKengät kengät = null;
	
	public Jasper(TuoteTehdas tehdas) {
		this.tehdas = tehdas;
	}
	
	public void pueVaatteet() {
		lippis = tehdas.createLippis();
		lippis.pueLippis();
		
		paita = tehdas.createPaita();
		paita.puePaita();
		
		farkut = tehdas.createFarkut();
		farkut.pueFarkut();
		
		kengät = tehdas.createKengät();
		kengät.pueKengät();
	}
	
	public void luetteleYlpeana() {
		System.out.println("\nMulla on päällä: " + lippis + ", " + paita + ", " + farkut + ", " + kengät + ".");
	}
}