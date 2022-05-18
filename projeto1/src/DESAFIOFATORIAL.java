import javax.swing.*;
import java.util.Scanner;

public class DESAFIOFATORIAL {
    public static void main(String[] args) {
        int tentativas = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Pin");
        int PIN = 0;
        int PIN_CORRETO = 91352;

        while (PIN != PIN_CORRETO && tentativas  < 3) {
            PIN = teclado.nextInt();
            tentativas++;
            if (PIN == PIN_CORRETO && tentativas <= 3) {
                    System.out.println("BEM VINDO");
                }
                else if (tentativas != 3) {
                    System.out.println("PIN INCORRETO!");
                } else {
                    System.out.println("BlOQUEADO");
                }
            }
    }
}


