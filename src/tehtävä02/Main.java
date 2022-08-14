package tehtävä02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		Class<?> c = null;
		ITuoteTehdas tehdas = null;

		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream("src/tehtävä02/tehdas.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			c = Class.forName(properties.getProperty("tehdas"));
			tehdas = (ITuoteTehdas) c.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Jasper jasper = new Jasper(tehdas);
		jasper.pueVaatteet();
		jasper.luetteleYlpeana();
	}
}