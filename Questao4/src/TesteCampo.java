import java.util.Scanner;

public class TesteCampo {
    public static void main(String[] args) throws Exception {
    
        Scanner ler = new Scanner(System.in);

        //Pegando as variaves para criar o campo
        System.out.println("========== Dados do campo ==========");
        System.out.println("Digite a posição do campo");
        System.out.print("X: ");
        double posiCampoX = ler.nextInt();
        System.out.print("Y: ");
        double posiCampoY = ler.nextInt();
        System.out.print("Digite a altura do campo: ");
        double altura = ler.nextInt();
        System.out.print("Digite a largura do campo: ");
        double largura = ler.nextInt();
        
        //Pegando as variaves para criar a bola
        System.out.println("========== Dados da bola ==========");
        System.out.print("Digite o raio que a bola vai ter: ");
        double raioBola = ler.nextInt();
        System.out.println("Digite a posição da bola");
        System.out.print("X: ");
        double posiBolaX = ler.nextInt();
        
        //Tratamento para não colocar a bola fora do campo;
        while((posiBolaX-raioBola <= posiCampoX) || (posiBolaX+raioBola >= posiCampoX+largura)){
            System.out.print("Você digitou uma posição fora do campo, digite outro valor para X: ");
            posiBolaX = ler.nextInt();
        }

        System.out.print("Y: ");
        double posiBolaY = ler.nextInt();

        while((posiBolaY-raioBola <= posiCampoY) || (posiBolaY+raioBola >= posiCampoY+altura)){
            System.out.print("Você digitou uma posição fora do campo, digite outro valor para Y: ");
            posiBolaY = ler.nextInt();
        }

        System.out.print("Digite a velocidade horizontal que a bola vai se mover: ");
        double veloHoBola = ler.nextInt();
        System.out.print("Digite a velocidade vertical que a bola vai se mover: ");
        double veloVeBola = ler.nextInt();
        
        ParOrdenado posicaoBola = new ParOrdenado(posiBolaX, posiBolaY);
        ParOrdenado posicaoCampo = new ParOrdenado(posiCampoX, posiCampoY);
        
        Bola bola = new Bola(posicaoBola, veloHoBola, veloVeBola, raioBola);
        
        CampoRetangular campo = new CampoRetangular(posicaoCampo, altura, largura, bola);
        
        System.out.println("A posição inicial da bola é: " + posicaoBola.toString());
        for(int i = 0; i< 30;i++){
            campo.movimentaBola();

        }

        
    }
}
