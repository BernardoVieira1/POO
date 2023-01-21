import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma palavra com 5 letras");
        String palavra = ler.nextLine();

        while(palavra.length() != 5){
            if(palavra.length() > 5){
                System.out.println("A palavra muito grande, digite novamente.");
            }
            if(palavra.length() < 5){
                System.out.println("A palavra muito pequena, digite novamente.");
            }
            palavra = ler.nextLine();
        }
            for(int i = 0;i < palavra.length(); i++){
                for(int j = 0; j < palavra.length(); j++){
                    for(int k = 0; k < palavra.length(); k++){
                        System.out.println(palavra.charAt(i)+""+palavra.charAt(j)+""+palavra.charAt(k));
                    }
                }
            }

    }    
}
