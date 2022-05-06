import java.util.Scanner;
// dizer se é tank dps healer
public class Desafio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean Classes = true;
        while (Classes) {
            System.out.println("Informe a abreviação da Classe: ");
            String clazz = in.next();
            if (clazz.length() != 3) {
                System.out.println("A CLASSE PRECISA TER 3 CARACTERES");
                continue;
            }

            switch (clazz) {
                case "PLD", "WAR", "DKN", "GNB":
                    System.out.println("TANK");
                    break;
                case "WHM", "SCK", "AST", "SAG":
                    System.out.println("HEALER");
                    break;
                case "MNK", "DRG", "NJA", "SMR", "RPR", "BRP", "MCK", "DNC", "BLM", "SMN", "RDM", "BEM":
                    System.out.println("DPS");
                    break;

                default:
                    System.out.println("PREENCHA UMA CLASSE VÁLIDA");
                    Classes = false;
            }
        }
    }
}
