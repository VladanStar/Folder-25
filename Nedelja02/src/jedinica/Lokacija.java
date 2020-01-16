
package jedinica;

public class Lokacija {
    private Duzina x,y;

    public Lokacija() {
    }

    public Lokacija(Duzina x, Duzina y) {
        this.x = x;
        this.y = y;
    }

    public Duzina getX() {
        return x;
    }

    public void setX(Duzina x) {
        this.x = x;
    }

    public Duzina getY() {
        return y;
    }

    public void setY(Duzina y) {
        this.y = y;
    }
    public void move(Ugao ugao, Duzina duzina){
        x.addMeters(duzina.toMeters() * Math.cos(ugao.toRadijans()));
        y.addMeters(duzina.toMeters() * Math.sin(ugao.toRadijans()));
    
    }
    
    
}
