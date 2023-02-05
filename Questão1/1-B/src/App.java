import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma data (ex: 13/03/2003):");
        String dataI = ler.nextLine();

        SimpleDateFormat formatar = new SimpleDateFormat("dd/mm/yyyy");

        Date dateII = formatar.parse(dataI);
        
        formatar.applyPattern("MMMM, dd 'de' yyyy");
        
        String noPadrao = formatar.format(dateII);

        System.out.println(noPadrao);
    }
}
