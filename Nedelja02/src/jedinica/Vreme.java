package jedinica;

public class Vreme {

    private double sekunde;

    protected Vreme() {
    }

    protected Vreme(double sekunde) {
        this.sekunde = sekunde;
    }

    public static Vreme fromSeconds(double sekunde) {
        return new Vreme(sekunde);

    }

    public static Vreme fromMinutes(double minute) {
        return new Vreme(minute * 60.0);
    }

    public static Vreme fromHours(double hours) {
        return new Vreme(hours * 3600.0);
    }

    public double toSeconds() {
        return this.sekunde;
    }

    public double toMinutes() {
        return this.sekunde / 60.0;
    }

    public double toHours() {
        return this.sekunde / 3600.0;
    }

    public double miliSeconds() {
        return this.sekunde * 1000.0;
    }

    public void addSeconds(double sekunde) {
        this.sekunde += sekunde;

    }

    public void addMinutes(double minute) {
        this.sekunde += minute * 60;
    }

    public void addHours(double hours) {
        this.sekunde += hours * 3600.0;
    }

}
