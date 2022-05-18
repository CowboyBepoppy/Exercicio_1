import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        System.out.println("Informe seu nome completo: ");
        Scanner in = new Scanner(System.in);
        String NOME = in.nextLine();
        String [] NOMES = NOME.split(" ");
        System.out.println(NOMES[0].charAt(0)+"."+NOMES[1].charAt(0));
    }
}