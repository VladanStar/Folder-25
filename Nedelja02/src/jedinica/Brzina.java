package jedinica;

public class Brzina {

    public double mps;

    public Brzina() {
    }

    public Brzina(double mps) {
        this.mps = mps;
    }

    public static Brzina fromMetersPerSecond(double mps) {
        return new Brzina(mps);
    }

    public static Brzina fromKilometersPerHour(double kmph) {
        return new Brzina(kmph / 3.6);
    }

    public double fromMetersPerSecond() {

        return this.mps;
    }

    public double fromKilometersPerHours() {
        return this.mps * 3.6;
    }
    public void addMetererPerSecon(double mps){
        this.mps += mps;
    }
    public void addKilometersPerHour(double kmph){
        this.mps+= kmph/3.6;
    }
    public Duzina predjeniPut(Vreme vreme){
        return Duzina.fromMeters(this.mps* vreme.toSeconds());
    }

}
