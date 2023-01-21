public class CampoRetangular {
    private ParOrdenado posicaoCanto;
    private int compriHorizontal;
    private int compriVertical;
    private Bola bola;

    public CampoRetangular(ParOrdenado posicaoCanto, int compriVertical, int compriHorizontal, Bola bola) {
        this.posicaoCanto = posicaoCanto;
        this.compriVertical = compriVertical;
        this.compriHorizontal = compriHorizontal;
        this.bola = bola;
    }
    
    public ParOrdenado getPosicaoCanto() {
        return posicaoCanto;
    }

    public int getCompriVertical() {
        return compriVertical;
    }

    public int getCompriHorizontal() {
        return compriHorizontal;
    }

    public Bola getBola() {
        return bola;
    }

    public boolean bolaTocaBordaEsquerda(){
        if((bola.getCentro().getX()-bola.getR()) <= posicaoCanto.getX()){
            return true;
        }
        return false;
    }

    public boolean bolaTocaBordaSuperior(){
        if((bola.getCentro().getY()-bola.getR()) <= posicaoCanto.getY()){
            return true;
        }
        return false;
    }

    public boolean bolaTocaBordaDireita(){
        if((bola.getCentro().getX()+bola.getR()) >= posicaoCanto.getX()+compriHorizontal){
            return true;
        }
        return false;
    }

    public boolean bolaTocaBordaInferior(){
        if((bola.getCentro().getY()+bola.getR()) >= posicaoCanto.getY()+compriVertical){
            return true;
        }
        return false;
    }

    public void movimentaBola(){
         
        if(bolaTocaBordaEsquerda()){
            bola.setvHorizontal((bola.getvHorizontal() * -1));
            System.out.println("*Bateu na borda esquerda*");
 
        }else if(bolaTocaBordaDireita()){
            bola.setvHorizontal((bola.getvHorizontal() * -1));
            System.out.println("*Bateu na borda direita*");

        }else if(bolaTocaBordaSuperior()){
            bola.setvVertical((bola.getvVertical() * -1));
            System.out.println("*Bateu na borda superior*");

        }else if(bolaTocaBordaInferior()){
            bola.setvVertical((bola.getvVertical() * -1));
            System.out.println("*Bateu na borda inferior*");
        }
        
        bola.movimenta();
        System.out.println(bola.toString());  
        
    }
    
}
