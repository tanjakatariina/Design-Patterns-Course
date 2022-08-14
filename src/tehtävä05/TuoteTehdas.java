package tehtävä05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import tehtävä05.adidas.AdidasTehdas;
import tehtävä05.boss.BossTehdas;

// Abstract Factory / Singleton
public abstract class TuoteTehdas {
	private static TuoteTehdas instance = null;

	public static TuoteTehdas Instance() {
		if (instance == null) {
			instance = getInstance();
		}
		return instance;
	}

	private static TuoteTehdas getInstance() {
		String tehdas = getTehdasNimi();
		
		if (tehdas.equals("adidas")) {
			instance = new AdidasTehdas();
		} else if (tehdas.equals("boss")) {
			instance = new BossTehdas();
		}

		return instance;
	}

	private static String getTehdasNimi() {
		Class<?> c = null;
		TuoteTehdas tehdas = null;
		String tehdasNimi = null;

		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream("src/tehtävä05/tehdas.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			c = Class.forName(properties.getProperty("tehdas"));
			tehdas = (TuoteTehdas) c.getDeclaredConstructor().newInstance();
			tehdasNimi = tehdas.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tehdasNimi;

	}

	// Factory methods
	public abstract ILippis createLippis();
	public abstract IPaita createPaita();
	public abstract IFarkut createFarkut();
	public abstract IKengät createKengät();
}