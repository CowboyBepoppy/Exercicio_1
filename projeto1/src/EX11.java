import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INFORME A PALAVRA: ");
        String PALAVRA = in.nextLine();

        //Para inverter
        String reverse = "";

                for(int i = (PALAVRA.length() - 1); i >= 0; i--) {
                    reverse += PALAVRA.charAt(i);
                }

                if (reverse.equals(PALAVRA)){
                    System.out.println("É");
                } else {
                    System.out.println("Nops");
                }
    }
}
