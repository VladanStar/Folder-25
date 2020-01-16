
package nedelja02.igra;

import jedinica.Brzina;
import jedinica.Lokacija;
import jedinica.Ugao;


public abstract class Neprijatelj extends PokretanObjekat {
    private double snaga;
    private double zivot;

    public Neprijatelj() {
    }

    public Neprijatelj(double snaga, double zivot) {
        this.snaga = snaga;
        this.zivot = zivot;
    }

    public Neprijatelj(double snaga, double zivot, Brzina brzina) {
        super(brzina);
        this.snaga = snaga;
        this.zivot = zivot;
    }

    public Neprijatelj( Lokacija lokacija, String slika, Brzina brzina,double snaga, double zivot) {
        super(lokacija, slika, brzina, Ugao.fromDegrees(0));
        this.snaga = snaga;
        this.zivot = zivot;
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
