package nedelja02.igra;

import jedinica.Brzina;
import jedinica.Lokacija;

public class Vuk extends Neprijatelj {
    private String boja;

    public Vuk() {
    }

    public Vuk(String boja) {
        this.boja = boja;
    }

    public Vuk(String boja, double snaga, double zivot) {
        super(snaga, zivot);
        this.boja = boja;
    }

    public Vuk(String boja, double snaga, double zivot, Brzina brzina) {
        super(snaga, zivot, brzina);
        this.boja = boja;
    }

    public Vuk(Lokacija lokacija, String slika, Brzina brzina, double snaga, double zivot, String boja) {
        super(lokacija, slika, brzina, snaga, zivot);
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
    
}
