
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner tabuada = new Scanner(System.in);
        System.out.println("Qual tabuada deseja saber?");
        int valor = tabuada.nextInt();
        while (valor != 0) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i*valor);
        }
            System.out.println("Qual tabuada deseja saber?");
                    valor = tabuada.nextInt();

        }
        }
}