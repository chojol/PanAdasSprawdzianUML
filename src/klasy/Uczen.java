package klasy;

public class Uczen extends Osoba{
    private String klasa;
    private boolean czyZdaje;

    public Uczen(String imie, String nazwisko, String pesel){
        super(imie, nazwisko, pesel);
    }
    public String getKlasa() {
        return klasa;
    }
    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }
    public boolean isCzyZdaje() {
        return czyZdaje;
    }
    public void setCzyZdaje(boolean czyZdaje) {
        this.czyZdaje = czyZdaje;
    }
}
