package nedelja02;

import java.util.LinkedList;
import java.util.List;
import jedinica.Brzina;
import jedinica.Duzina;
import jedinica.Lokacija;
import jedinica.Vreme;
import nedelja02.igra.Igrac;
import nedelja02.igra.NepokretanObjekat;
import nedelja02.igra.Objekat;
import nedelja02.igra.Vuk;

public class Nedelja02 {
    
    public static void main(String[] args) {
        List<Objekat> listaObjekata = new LinkedList<>();
        Vuk v1 = new Vuk(
        new Lokacija(
                        Duzina.fromMeters(18),
                        Duzina.fromMeters(17)
                ),
                "slike.vuk01.png",
                Brzina.fromMetersPerSecond(42),
                10.2,
                0.9,
                "siva"
        );
         Vuk v2 = new Vuk(
        new Lokacija(
                        Duzina.fromMeters(11),
                        Duzina.fromMeters(11)
                ),
                "slike.vuk02.png",
                Brzina.fromKilometersPerHour(40),
                17.2,
                1.0,
                "crna"
        );
        NepokretanObjekat no1 = new NepokretanObjekat(
                new Lokacija(
                        Duzina.fromMeters(10),
                        Duzina.fromMeters(10)
                ),
                "slike.drvo.png",
                "drvo");
        
        Igrac i1 = new Igrac(
         new Lokacija(
                        Duzina.fromMeters(13),
                        Duzina.fromMeters(21)
                ),
                "slike.HogarStrasni.png",
                Brzina.fromKilometersPerHour(40)
           
        );
        
        listaObjekata.add(no1);
        listaObjekata.add(i1);
        listaObjekata.add(v1);
        listaObjekata.add(v2);
        v1.move(Vreme.fromMinutes(2));
         v2.move(Vreme.fromMinutes(12));
         
        System.out.println("Ukupno bojekta: "+ listaObjekata.size());
        
    }
    
}
