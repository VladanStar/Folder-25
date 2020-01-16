package nedelja02.igra;

import jedinica.Duzina;
import jedinica.Lokacija;

public abstract class Objekat {

    private Lokacija lokacija;
    private String slika;

    public Objekat() {
    }

    public Objekat(Lokacija lokacija, String slika) {
        this.lokacija = lokacija;
        this.slika = slika;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }
    

}
