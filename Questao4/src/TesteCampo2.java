import java.util.Scanner;
import java.util.Random;

public class TesteCampo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        //Pegando as variaves para o campo
        
        
        
        
        System.out.println("========== Dados do campo ==========");
        System.out.print("Digite a largura do campo: ");
        int largura = ler.nextInt();
        System.out.print("Digite a altura do campo: ");
        int altura = ler.nextInt();

        System.out.println("========== Dados da bola ==========");
        System.out.print("Digite o raio que a bola vai ter: ");
        int raioBola = ler.nextInt();


        ParOrdenado posicaoCampo = new ParOrdenado(0,0);
        ParOrdenado posicaoBola = new ParOrdenado((largura/2),(altura/2));

    
        
        double veloHorizontal = aleatorio.nextDouble((((largura*10)/100)+1)-((largura*5)/100))+((largura*5)/100);
        double veloVertical = aleatorio.nextDouble((((altura*10)/100)+1)-((altura*5)/100))+((altura*5)/100);

        
        Bola bola = new Bola(posicaoBola, veloHorizontal, veloVertical, raioBola);
    
        CampoRetangular campo = new CampoRetangular(posicaoCampo,altura,largura,bola);
        

        System.out.println("A posição inicial da bola é: " + posicaoBola.toString());
        for(int i = 0; i< 30;i++){
            campo.movimentaBola();

        }

    }
}
