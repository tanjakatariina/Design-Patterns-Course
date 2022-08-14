package tehtävä05;

public class Main {

	public static void main(String[] args) {
		Jasper jasper = new Jasper(TuoteTehdas.Instance());
		jasper.pueVaatteet();
		jasper.luetteleYlpeana();
	}
}