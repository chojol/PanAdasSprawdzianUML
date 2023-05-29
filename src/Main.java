import klasy.Komputer;
import klasy.Uczen;

public class Main {
    public static void main(String[] args) {
        Komputer komputer = new Komputer();
        komputer.setNumer(69);
        komputer.setCzyDziala(false);
        Uczen uczen = new Uczen("jakub", "hojol", "2137");
    }
}