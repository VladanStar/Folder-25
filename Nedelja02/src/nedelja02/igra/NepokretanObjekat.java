
package nedelja02.igra;

import jedinica.Lokacija;


public class NepokretanObjekat extends Objekat {
    private String ime;

    public NepokretanObjekat() {
    }

    public NepokretanObjekat(String ime) {
        this.ime = ime;
    }

    public NepokretanObjekat(Lokacija lokacija, String slika,String ime) {
        super(lokacija, slika);
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    
    
    
}
