package tehtävä11;

import java.util.Random;

// Originator
public class Arvuuttaja {
	
	public Arvuuttaja() {
	}
	
	public Object liityPeliin() {
		Random rand; rand = new Random();
		int luku = rand.nextInt(10 - 1) + 1;
		System.err.println("Arvottu luku: " + luku);
		return new Memento(luku);
	}
	
	public boolean vertaa(Object object, int arvottuLuku) {
		Memento memento = (Memento) object;
		
		if (memento.getLuku() == arvottuLuku) {
			return true;
		}
		return false;
	}
	
	// Memento
	private class Memento {
		private int luku;

		public Memento(int luku) {
			this.luku = luku;
		}

		public int getLuku() {
			return this.luku;
		}
	}
}