package jedinica;

public class Duzina {

    private double metri;

    public Duzina() {
    }

    public Duzina(double metri) {
        this.metri = metri;
    }

    public static Duzina fromMeters(double metara) {
        return new Duzina(metara);
    }

    public static Duzina fromKilometers(double kilometri) {
        return new Duzina(kilometri * 1000.0);
    }

    public double toMeters() {
        return this.metri;
    }

    public double toKilometres() {
        return this.metri / 1000.0;
    }

    public void addMeters(double metri) {
        this.metri += metri;
    }

    public void addKilometers(double kilometri) {
        this.metri += kilometri * 1000.0;
    }

    

}
