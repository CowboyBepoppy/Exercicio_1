import java.util.Scanner;

public class Exerciciosix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a String que quer informações..: ");
        String frase = in.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("Essa palavra possui..: " + contador + " espacos.");

    }
}
