import javax.swing.*;
import java.util.Scanner;

public class Exercicio5 {
    // 1.Pedir ao usuário quantas palavras ele deseja informar;
    // 2. Pedir ao usuuário cada palavra;
    // 3. Informar em uma única linha as palavras que o usuário informou
    //    separadas por vírgula;
    // 2 fors sem while

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas palavras?");
        int QntPalavra = in.nextInt();
        String[] palavras = new String[QntPalavra];
        for (int i = 0; i < QntPalavra; i++) {
            System.out.println("informe a palavra: ");
            palavras[i] = in.next();
        }
        String palavraFinal = "";
        for (int i = 0; i < palavras.length; i++) {
            if (i ==0) {
              palavraFinal += palavras[i];
            } else {
                palavraFinal += ", "+palavras;
            }
            System.out.println(palavraFinal);
        }
    }

}





