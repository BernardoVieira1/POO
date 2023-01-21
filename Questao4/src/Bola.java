public class Bola {
    private ParOrdenado centro;
    private int vHorizontal;
    private int vVertical;
    private final int r;
    
    public Bola(ParOrdenado centro, int vHorizontal, int vVertical, int r) {
        this.centro = centro;
        this.vHorizontal = vHorizontal;
        this.vVertical = vVertical;
        this.r = r;
    }

    public int getvHorizontal() {
        return vHorizontal;
    }

    public void setvHorizontal(int vHorizontal) {
        this.vHorizontal = vHorizontal;
    }

    public int getvVertical() {
        return vVertical;
    }

    public void setvVertical(int vVertical) {
        this.vVertical = vVertical;
    }

    public ParOrdenado getCentro() {
        return centro;
    }

    public int getR() {
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

