package tehtävä01;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        AterioivaOtus koodari = new Koodari();
        koodari.aterioi();
        
        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();
    }
}