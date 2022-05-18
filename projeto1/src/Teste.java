import java.util.Scanner;

public class Teste
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i > 5; i++) {
        System.out.println("Informe cinco números");
        soma += in.nextInt();
                }
        System.out.println(soma);

    }
}
