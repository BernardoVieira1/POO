public class CampoRetangular {
    private ParOrdenado posicaoCanto;
    private double compriHorizontal;
    private double compriVertical;
    private Bola bola;

    public CampoRetangular(ParOrdenado posicaoCanto, double compriVertical, double compriHorizontal, Bola bola) {
        this.posicaoCanto = posicaoCanto;
        this.compriVertical = compriVertical;
        this.compriHorizontal = compriHorizontal;
        this.bola = bola;
    }
    
    public ParOrdenado getPosicaoCanto() {
        return posicaoCanto;
    }

    public double getCompriVertical() {
        return compriVertical;
    }

    public double getCompriHorizontal() {
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
            if(bolaTocaBordaSuperior()){
                bola.setvVertical((bola.getvVertical() * -1));
                bola.setvHorizontal((bola.getvHorizontal() * -1));
                System.out.println("*Bateu no canto superior esquerdo*");
            }else if(bolaTocaBordaInferior()){
                bola.setvVertical((bola.getvVertical() * -1));
                bola.setvHorizontal((bola.getvHorizontal() * -1));
                System.out.println("*Bateu no canto inferior esquerdo*");
            }else{
                bola.setvHorizontal((bola.getvHorizontal() * -1));
                System.out.println("*Bateu na borda esquerda*");
            }
            
        }else if(bolaTocaBordaDireita()){
            if(bolaTocaBordaSuperior()){
                bola.setvVertical((bola.getvVertical() * -1));
                bola.setvHorizontal((bola.getvHorizontal() * -1));
                System.out.println("*Bateu no canto superior direito*");
            }else if(bolaTocaBordaInferior()){
                bola.setvVertical((bola.getvVertical() * -1));
                bola.setvHorizontal((bola.getvHorizontal() * -1));
                System.out.println("*Bateu no canto inferior direito*");
            }else{
                bola.setvHorizontal((bola.getvHorizontal() * -1));
                System.out.println("*Bateu na borda direita*");
            }
            

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
