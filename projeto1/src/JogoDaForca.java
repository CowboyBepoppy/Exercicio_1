import com.sun.tools.javac.Main;

import java.beans.PropertyDescriptor;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        System.out.println("Digite a palavra: ");
        Scanner in = new Scanner(System.in);
        String palavra = in.next();
        String palavraAdv = "";
        String letrasUsadas = "";
        int mAXTentativas = 6;    

        for (int i = 0; i < palavra.length(); i++) {
            palavraAdv += "_";
            for (int tentativas = 0; ; tentativas++) {
                if (tentativas == mAXTentativas) {
                    System.out.printf("FORCA, a palavra correta seria '%s'", palavra);
                    break;
                }
                System.out.printf("rodada %d. Até agora: %s. Qual sua próxima letra?%n", tentativas, palavraAdv);

                char letrastentadas = in.next().charAt(0);
                {
                    if (letrasUsadas.indexOf(letrastentadas) >= 0) {
                        tentativas = (tentativas - 1);
                        System.out.printf("Você já tentou a letra %c.%n", letrastentadas);

                    } else {
                        letrasUsadas += letrastentadas;

                        if (palavraAdv.indexOf(letrastentadas) >= 0) {
                            palavraAdv = "";

                            for (int j = 0; j < palavraAdv.length(); j++) {
                                palavraAdv += letrasUsadas
                                        .indexOf(palavraAdv.charAt(j)) >= 0 ? palavraAdv.charAt(j) : "_";
                            }
                            if (palavraAdv.contains("_")) {
                                System.out.printf("%s existe na palavra. Ainda tem letras escodidas%n", letrastentadas);
                            } else {
                                System.out.printf("BOA era '%s',", palavraAdv);
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }
    }

    }
