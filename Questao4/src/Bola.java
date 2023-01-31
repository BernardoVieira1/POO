public class Bola {
    private ParOrdenado centro;
    private double vHorizontal;
    private double vVertical;
    private final double r;
    
    public Bola(ParOrdenado centro, double vHorizontal, double vVertical, double r) {
        this.centro = centro;
        this.vHorizontal = vHorizontal;
        this.vVertical = vVertical;
        this.r = r;
    }

    public double getvHorizontal() {
        return vHorizontal;
    }

    public void setvHorizontal(double vHorizontal) {
        this.vHorizontal = vHorizontal;
    }

    public double getvVertical() {
        return vVertical;
    }

    public void setvVertical(double vVertical) {
        this.vVertical = vVertical;
    }

    public ParOrdenado getCentro() {
        return centro;
    }

    public double getR() {
        return r;
    }

    public void movimenta(){
        centro.setX(centro.getX()+vHorizontal);
        centro.setY(centro.getY()+vVertical);
        
    }

    public String toString(){
        return ("A bola está na posição (" + centro.getX() + "," + centro.getY() + ") se movendo a uma velocidade (" + vHorizontal + ","+ vVertical +") pixels por movimento");
    }
   


}

