package klasy;

public class Osoba {
    private String imie, nazwisko, pesel;
    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }
    public Osoba(Osoba osoba) {
        imie = osoba.getimie();
        nazwisko = osoba.getnazwisko();
        pesel = osoba.getpesel();
    }

    private String getpesel() {
        return pesel;
    }
    public void setPesel(String pesel){
        this.pesel = pesel;
    }

    private String getnazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    private String getimie() {
        return imie;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
}
