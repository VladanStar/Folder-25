package nedelja02.igra;

import jedinica.Brzina;
import jedinica.Lokacija;
import jedinica.Ugao;

public class Igrac extends PokretanObjekat {

    private String ime = "";
    private double snaga = 0;
    private double zivot = 0;

    public Igrac() {
    }

    public Igrac(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika, brzina, Ugao.fromDegrees(0));
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getSnaga() {
        return snaga;
    }

    public void setSnaga(double snaga) {
        this.snaga = snaga;
    }

    public double getZivot() {
        return zivot;
    }

    public void setZivot(double zivot) {
        this.zivot = zivot;
    }
    

}
