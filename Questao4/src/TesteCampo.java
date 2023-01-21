import java.util.Scanner;

public class TesteCampo {
    public static void main(String[] args) throws Exception {
    
        Scanner ler = new Scanner(System.in);

        //Pegando as variaves para criar o campo
        System.out.println("========== Dados do campo ==========");
        System.out.println("Digite a posição do campo");
        System.out.print("X: ");
        int posiCampoX = ler.nextInt();
        System.out.print("Y: ");
        int posiCampoY = ler.nextInt();
        System.out.print("Digite a altura do campo: ");
        int altura = ler.nextInt();
        System.out.print("Digite a largura do campo: ");
        int largura = ler.nextInt();
        
        //Pegando as variaves para criar a bola
        System.out.println("========== Dados da bola ==========");
        System.out.println("Digite a posição da bola");
        System.out.print("X: ");
        int posiBolaX = ler.nextInt();
        System.out.print("Y: ");
        int posiBolaY = ler.nextInt();
        System.out.print("Digite o raio que a bola vai ter: ");
        int raioBola = ler.nextInt();
        System.out.print("Digite a velocidade horizontal que a bola vai se mover: ");
        int veloHoBola = ler.nextInt();
        System.out.print("Digite a velocidade vertical que a bola vai se mover: ");
        int veloVeBola = ler.nextInt();
        
        ParOrdenado posicaoBola = new ParOrdenado(posiBolaX, posiBolaY);
        ParOrdenado posicaoCampo = new ParOrdenado(posiCampoX, posiCampoY);
        
        Bola bola = new Bola(posicaoBola, veloHoBola, veloVeBola, raioBola);
        
        CampoRetangular campo = new CampoRetangular(posicaoCampo, altura, largura, bola);
        
        

        System.out.println("A posição inicial da bola é: " + posicaoBola.toString());
        for(int i = 0; i<30;i++){
            campo.movimentaBola();

        }

        
    }
}
