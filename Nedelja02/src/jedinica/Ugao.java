
package jedinica;

public class Ugao {
    private double radijani;

    public Ugao() {
    }

    public Ugao(double radijani) {
        this.radijani = radijani;
    }
    public static Ugao fromRadians(double radijani){
        return new Ugao(radijani);
    }
    public static Ugao fromDegrees(double stepeni){
        return new Ugao(stepeni*Math.PI/180);
    }
    public double toRadijans(){
        return radijani;
    }
    public double toDegrees(){
        return radijani*180/Math.PI;
    }
    public void rotateLeft(Ugao ugao){
        radijani = Math.toRadians(toDegrees() + ugao.toDegrees());
    
    }
    
}
