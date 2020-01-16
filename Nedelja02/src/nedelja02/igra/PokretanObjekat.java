
package nedelja02.igra;

import jedinica.Brzina;
import jedinica.Duzina;
import jedinica.Lokacija;
import jedinica.Ugao;
import jedinica.Vreme;


public abstract class PokretanObjekat extends Objekat{
    private Brzina brzina;
    private Ugao ugao;

    public PokretanObjekat() {
    }

    public PokretanObjekat(Brzina brzina) {
        this.brzina = brzina;
    }

    public PokretanObjekat(Lokacija lokacija, String slika,Brzina brzina, Ugao ugao) {
        super(lokacija, slika);
        this.brzina = brzina;
        this.ugao = ugao;
    }

    public Brzina getBrzina() {
        return brzina;
    }

    public void setBrzina(Brzina brzina) {
        this.brzina = brzina;
    }

    public Ugao getUgao() {
        return ugao;
    }

    public void setUgao(Ugao ugao) {
        this.ugao = ugao;
    }
    
    public void move(Vreme vreme){
        Duzina duzinaPuta;
        getLokacija().move(ugao,  brzina.predjeniPut(vreme));
    }
    
}
