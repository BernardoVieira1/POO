import java.util.Scanner;
import java.util.Random;

public class TesteCampo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Pegando as variaves para o campo
        
        /*
        System.out.println("========== Dados do campo ==========");
        System.out.print("Digite a altura do campo: ");
        int altura = ler.nextInt();
        System.out.print("Digite a largura do campo: ");
        int largura = ler.nextInt();
        
        System.out.println("========== Dados da bola ==========");
        System.out.print("Digite o raio que a bola vai ter: ");
        int raioBola = ler.nextInt();
        
        ParOrdenado posicaoBola = new ParOrdenado((largura/2),(altura/2));
        ParOrdenado posicaoCampo = new ParOrdenado(0,0);
        
        
        * 
        */
        
        Random aleatorio = new Random();


        double veloHorizontal = aleatorio.nextDouble(1.0 , 2.0);

        ((10*5)/100),((10*10)/100);
        ((10*5)/100),((10*10)/100);

        int veloVertical = aleatorio.nextInt();

        System.out.println(veloHorizontal+","+veloVertical);
        
        //Bola bola = new Bola(posicaoBola, (),() , raioBola)



        //System.out.println(aleatorio.nextInt(6,10));






    }
}
